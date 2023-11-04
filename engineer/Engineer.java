package seminar6.engineer;

// Interface segregation principle
//Клиенты не должны реализовывать интерфейсы,
//которые они не используют.
//Данный принцип требует разделения «толстых»
//интерфейсов на несколько специализированных,
//связанных общей функциональностью.

interface Worker {
    void work();

    void eat();
}

class Engineer implements Worker {
    @Override
    public void work() {
        System.out.println("У работника рабочее время");
    }

    @Override
    public void eat() {
        System.out.println("У работника обед");
    }
}