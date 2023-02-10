def add(*number):
    
    base = 0

    for n in number:
        base += n
        
    print(base)

add(*list(map(int,input("Enter the numbers (Put spaces between the numbers): ").split())))