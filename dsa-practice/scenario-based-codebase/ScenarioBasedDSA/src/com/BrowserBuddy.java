package com;
import java.util.*;

public class BrowserBuddy {

    private LinkedList<String> history;
    private int currentIndex;

    private Stack<LinkedList<String>> closedTabs;

    public BrowserBuddy() {
        history = new LinkedList<>();
        currentIndex = -1;
        closedTabs = new Stack<>();
    }

    public void visitPage(String url) {
        while (history.size() > currentIndex + 1) {
            history.removeLast();
        }
        history.add(url);
        currentIndex++;
        System.out.println("Visited: " + url);
    }

    public void goBack() {
        if (currentIndex > 0) {
            currentIndex--;
            showCurrentPage();
        } else {
            System.out.println("No previous page.");
        }
    }

    public void goForward() {
        if (currentIndex < history.size() - 1) {
            currentIndex++;
            showCurrentPage();
        } else {
            System.out.println("No next page.");
        }
    }

    public void closeTab() {
        if (!history.isEmpty()) {
            closedTabs.push(new LinkedList<>(history));
            history.clear();
            currentIndex = -1;
            System.out.println("Tab closed.");
        } else {
            System.out.println("No tab to close.");
        }
    }

    public void reopenTab() {
        if (!closedTabs.isEmpty()) {
            history = closedTabs.pop();
            currentIndex = history.size() - 1;
            System.out.println("Tab reopened.");
            showCurrentPage();
        } else {
            System.out.println("No closed tabs available.");
        }
    }

    public void showCurrentPage() {
        if (currentIndex >= 0 && !history.isEmpty()) {
            System.out.println("Current Page: " + history.get(currentIndex));
        } else {
            System.out.println("No page open.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BrowserBuddy browser = new BrowserBuddy();

        while (true) {
            System.out.println("\n===== BrowserBuddy Menu =====");
            System.out.println("1. Visit New Page");
            System.out.println("2. Back");
            System.out.println("3. Forward");
            System.out.println("4. Close Tab");
            System.out.println("5. Reopen Closed Tab");
            System.out.println("6. Show Current Page");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter URL: ");
                    String url = sc.nextLine();
                    browser.visitPage(url);
                    break;

                case 2:
                    browser.goBack();
                    break;

                case 3:
                    browser.goForward();
                    break;

                case 4:
                    browser.closeTab();
                    break;

                case 5:
                    browser.reopenTab();
                    break;

                case 6:
                    browser.showCurrentPage();
                    break;

                case 7:
                    System.out.println("Exiting BrowserBuddy...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
