# Used to split a landscape image containing two pages, into two images containing one page each.
# Saved in "processed2" directory.

from PIL import Image

left1 = 150
up1 = 650
right1 = 1600
down1 = 2750

left2 = 1700
up2 = 650
right2 = 3300
down2 = 2750

j = 0
for i in range(1, 125):
    # if i > 12:
    #     left1 = 250
    #     left2 = 1800
    #     right2 = 3400
    if i >= 70:
        left1 = 200
        right1 = 1660
        left2 = 1750
    
    if i >= 80:
        right2 = 3350
    
    if i >= 100:
        up1 = 600
        up2 = 600
        down1 = 2700
        down2 = 2700
    
    if i > 105:
        left1 += 60
        right1 += 60
        left2 += 60
        right2 += 60
    
    if i >= 115:
        left1 -= 60
        right1 -= 60
    
    img = Image.open(f'rotated_images2/{i}.jpg')
    img2 = img.crop((left1, up1, right1, down1))
    #img2.show()

    img3 = img.crop((left2, up2, right2, down2))
    #img3.show()
    
    img2.save(f'processed2/{j}.jpg')
    print(f"Image {j} saved.")
    j += 1
    img3.save(f'processed2/{j}.jpg')
    print(f"Image {j} saved.")
    j += 1