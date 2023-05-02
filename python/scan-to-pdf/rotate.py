# Used to rotate any images that were portrait into landscape.
# Note: It'll rotate any page, regardless of orientation, but its use case was to rotate portrait pages into landscape.

from PIL import Image

for i in range(1, 125):
    img = Image.open(f'original_images2/{i}.jpg')
    img = img.rotate(90, expand=True)
    #img.show()
    img.save(f'rotated_images2/{i}.jpg')
    print(f"Image {i} saved.")