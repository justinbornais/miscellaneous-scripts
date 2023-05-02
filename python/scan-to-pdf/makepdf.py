# This is for taking a collection of images in some directory (in this case, the "processed2" directory) and combining it into one PDF.

from PIL import Image

images = [
    Image.open(f'processed2/{i}.jpg')
    for i in range(1, 247)
]

print(len(images))

pdf_path = "book2.pdf"
for i in range(246):
    print('', end='')
    #images[i] = images[i].resize((1550, 2200))
    images[i] = images[i].resize((int(1550 * 0.85), int(2200 * 0.85))) # Resize the images.
    #print(img.size)

print("Saving...")
images[0].save(pdf_path, "PDF", resolution=100.0, save_all=True, append_images=images[1:], dpi=(600, 600))
print("Saved!")