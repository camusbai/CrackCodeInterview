package cci.chapter.one;

public class QuestionSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pixel[][] matrix = new Pixel[5][5];
		for(int height=0;height<5;++height){
			for(int width=0;width<5;++width){
				matrix[height][width] = new Pixel(height*5+width+1);
			}			
		}
		printMatrix(matrix,5,5);
		
	}
	
	public static <T> void printMatrix(T[][] matrix, int height, int width){
		for(int h=0;h<height;++h){
			for(int w=0;w<width;++w){
				System.out.print(matrix[h][w]+" ");
			}			
			System.out.print("\n");
		}
			
	}
	
	private static class Pixel{
		private int hexValue;
		
		Pixel(int hexValue){
			this.hexValue = hexValue;
		}
		
		@Override
		public String toString(){
			return String.valueOf(hexValue);
		}
	}

}
