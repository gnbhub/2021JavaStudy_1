import java.util.Scanner;

class Hw4_1 {
	public static void main(String [] args){
		
		double x1, x2, y1, y2, garo, sero;
		
		Scanner s = new Scanner(System.in);
		
		System.out.printf("��1�� x��ǥ: ");
		x1 = s.nextDouble();
		System.out.printf("��1�� y��ǥ: ");
		y1 = s.nextDouble();
		System.out.printf("��2�� x��ǥ: ");
		x2 = s.nextDouble();
		System.out.printf("��2�� y��ǥ: ");
		y2 = s.nextDouble();

		garo = x1-x2;
		sero = y1-y2;
		
		if(garo<0)
			garo *= -1;
		if(sero<0)
			sero *= -1;
		
		while((garo==0)||(sero==0)){
			System.out.printf("�� (%.2f, %.2f)�� �� (%.2f, %.2f)�� ���簢���� �̷��� �ʽ��ϴ�.\n�ٽ� �Է����ּ���.\n", x1, y1, x2, y2);
			
			System.out.printf("��1�� x��ǥ: ");
			x1 = s.nextDouble();
			System.out.printf("��1�� y��ǥ: ");
			y1 = s.nextDouble();
			System.out.printf("��2�� x��ǥ: ");
			x2 = s.nextDouble();
			System.out.printf("��2�� y��ǥ: ");
			y2 = s.nextDouble();

			garo = x1-x2;
			sero = y1-y2;
		
			if(garo<0)
				garo *= -1;
			if(sero<0)
				sero *= -1;
		}
		System.out.printf("=============��� ���=============\n");
		System.out.format("- �ѷ��� ����: %.2f\n", (garo+sero)*2);
		System.out.format("- ����: %.2f\n", garo*sero);
		System.out.format("- �밢���� ����: %.2f\n", Math.sqrt(garo*garo+sero*sero));

	}
}