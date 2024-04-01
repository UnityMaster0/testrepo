def add(*number):

    num = 0

    for n in number:
        num += n

    print(num)


add(*list(map(float, input("Enter the numbers (Put spaces between the numbers): ").split())))
