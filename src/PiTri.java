public class PiTri {

    public static void main(String[] args) {
        if(args == null || args.length == 0){
            System.out.println("������� ���������� ����������� ����� ��� ������ ��� ������� ��� ����� ��� ��������.");
            return;
        }
        if(args.length == 1){ //������� N �����
            int N = Integer.parseInt(args[0]);
            int a = 1;
            int i = 0;
            while (i < N && a < 1000){
                int b = 1;
                while (i < N && b < 1000) {
                    int c = 1;
                    while (i < N && c < 1000){
                        if(checkTriple(a, b, c)){
                            System.out.println("����� " + a + ", " + b + ", " + c + " �������� ����������� �������");
                            i++;
                        }
                        c++;
                    }
                    b++;
                }
                a++;
            }
        } else if (args.length == 3) { //��������� ��� �����
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = Integer.parseInt(args[2]);
            if(checkTriple(a, b, c)){
                System.out.println(a + ", "+ b + ", "+ c + " � ��� ��������� ���������� ������!");
            } else {
                System.out.println("��� ����� �� �������� ����������� �������");
            }
        }
    }

    private static boolean checkTriple(int a, int b, int c) {
        return a * a + b * b == c * c;
    }

}
