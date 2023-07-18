def add(*number):

    base = 0

    for n in number:
        base += n

    print(base)


add(*list(map(float, input("Enter the numbers (Put spaces between the numbers): ").split())))
