class Door {
    protected boolean isOpen = false;

    public void openDoor() {
        if (!isOpen) {
            System.out.println("Door opened");
            isOpen = true;
        } else {
            System.out.println("Door already open!");
        }
    }

    public void closeDoor() {
        if (!isOpen) {
            System.out.println("Door already closed!");
        } else {
            System.out.println("Door closed");
            isOpen = false;
        }
    }
}



import java.util.Scanner;

public class TestDoor {
    public static void main(String[] args) {
        Door door = new Door();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 3) {
            System.out.println("Enter your choice:");
            System.out.println("1: Open door");
            System.out.println("2: Close door");
            System.out.println("3: Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    door.openDoor();
                    break;
                case 2:
                    door.closeDoor();
                    break;
                case 3:
                    System.out.println("Exiting the program");
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }
        scanner.close();
    }
}



class DoorWithLock extends Door {
    protected boolean isLocked = false;

    @Override
    public void openDoor() {
        if (!isOpen && isLocked) {
            System.out.println("Door is locked and cannot be opened!");
            return;
        }
        super.openDoor();
    }

    public void lockDoor() {
        if (isOpen) {
            System.out.println("Open door cannot be locked!");
        } else if (!isLocked) {
            System.out.println("Door locked");
            isLocked = true;
        } else {
            System.out.println("Door already locked!");
        }
    }

    public void unlockDoor() {
        if (!isLocked) {
            System.out.println("Door is not locked!");
        } else {
            System.out.println("Door unlocked");
            isLocked = false;
        }
    }
}


DoorWithLock doorWithLock = new DoorWithLock();
int choice = 0;

while (choice != 5) {
    System.out.println("Enter your choice:");
    System.out.println("1: Open door");
    System.out.println("2: Close door");
    System.out.println("3: Lock door");
    System.out.println("4: Unlock door");
    System.out.println("5: Exit");

    choice = scanner.nextInt();

    switch (choice) {
        case 1:
            doorWithLock.openDoor();
            break;
        case 2:
            doorWithLock.closeDoor();
            break;
        case 3:
            doorWithLock.lockDoor();
            break;
        case 4:
            doorWithLock.unlockDoor();
            break;
        case 5:
            System.out.println("Exiting the program");
            break;
        default:
            System.out.println("Invalid option!");
            break;
    }
}




class DoorWithCodeLock extends DoorWithLock {
    private int code = 0;

    @Override
    public void lockDoor() {
        if (isOpen) {
            System.out.println("Open door cannot be locked!");
        } else {
            System.out.println("Enter the code to lock the door:");
            Scanner scanner = new Scanner(System.in);
            code = scanner.nextInt();
            super.lockDoor();
            scanner.close();
        }
    }



    @Override
    public void unlockDoor() {
        if (isLocked) {
            System.out.println("Enter the code to unlock the door:");
            Scanner scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();
            if (userInput == code) {
                super.unlockDoor();
            } else {
                System.out.println("Invalid code!");
            }
            scanner.close();
        } else {
            super.unlockDoor();
        }
    }
}



DoorWithCodeLock doorWithCodeLock = new DoorWithCodeLock();
int choice = 0;

while (choice != 5) {
    System.out.println("Enter your choice:");
    System.out.println("1: Open door");
    System.out.println("2: Close door");
    System.out.println("3: Lock door");
    System.out.println("4: Unlock door");
    System.out.println("5: Exit");

    choice = scanner.nextInt();

    switch (choice) {
        case 1:
            doorWithCodeLock.openDoor();
            break;
        case 2:
            doorWithCodeLock.closeDoor();
            break;
        case 3:
            doorWithCodeLock.lockDoor();
            break;
        case 4:
            doorWithCodeLock.unlockDoor();
            break;
        case 5:
            System.out.println("Exiting the program");
            break;
        default:
            System.out.println("Invalid option!");
            break;
    }
}


