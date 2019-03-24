package lab3;

class Task {
    private static int number;

    Task() {
        Task.number = 0;
    }

    int getNumber() {
        return Task.number;
    }

    void increaseByTen() {
        number = number + 10;
    }

    void increaseByThousand() {
        number = number + 1000;
    }
}
