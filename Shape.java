class Shape {
    int getCorner() {
        return 0;
    }
}

class Rectangle extends Shape {
    int getCorner() { //overriding
        return 4;
    }

    int getCornerParent() {
        return super.getCorner(); //super keyoword
    }
}
