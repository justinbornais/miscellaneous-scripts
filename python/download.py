# Used to download PDFs from an open-source website ninsheetmusic.org using the urllib.request library in Python.

from urllib.request import urlopen
from urllib.request import urlretrieve
import cgi

url = "https://www.ninsheetmusic.org/download/pdf/"

for i in range(5029 + 1, 6001):
    
    temp = url + str(i)
    try:
        remotefile = urlopen(temp)
        blah = remotefile.info()['Content-Disposition']
        value, params = cgi.parse_header(blah)
        filename = params["filename"]
        urlretrieve(temp, filename)
        print(f"Downloaded from {temp} successfully.")
    except:
        print(f"{temp} URL not found.")