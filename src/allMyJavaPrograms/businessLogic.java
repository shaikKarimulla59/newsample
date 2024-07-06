package allMyJavaPrograms;
import java.util.Scanner;
public class businessLogic {
//...........................................................
	
		void switchmethod(int  integer) {//1 METHOD START HERE
			Scanner sc=new Scanner(System.in);
			switch (integer) {//SWITCH START HERE 
	//..............................................................................................
			case 1:
				      
				      System.out.println("Enter a value: ");
				      int a1=sc.nextInt();
				      System.out.println("Enter b value: ");
				      int b1=sc.nextInt();
				      System.out.println("Enter c value: ");
				      int c1=sc.nextInt();
				      int max=((a1>b1)?(a1>c1)?a1:c1:(b1>c1)?b1:c1);
				      System.out.print(max+" is a Biggest Number from the Given Numbers");
				break;
	//...............................................................................................
			case 2:
				       
				        System.out.println("Enter starting range: ");
				        int a2=sc.nextInt();
				        System.out.println("Enter ending range: ");
				        int b2=sc.nextInt();
				        int sum=0;
				        if(a2<b2){
				            while(a2<=b2){
				                sum=sum+a2;
				                a2++;
				            }
				            System.out.print(sum);
				        }else{
				           System.out.print("INVALID RANGE");
				        }
				break;
	//...............................................................................................
			case 3:
				       
				        System.out.print("Enter a value: ");
				        int a3=sc.nextInt();
				        System.out.print("Enter b value: ");
				        int b3=sc.nextInt();
				        System.out.println("Enter operator to purform task like +,-,*,/,%");
				        char ch3=sc.next().charAt(0);
				        switch (ch3){
				            case '+':
				            System.out.print(a3+b3);
				            break;
				            case '-':
				                System.out.print(a3-b3);
				            break;
				            case '*':
				                System.out.print(a3*b3);
				            break;
				            case '%':
				                System.out.print(a3%b3);
				            break;
				            case '/':
				                System.out.print(a3/b3);
				            break;     
				        }
				break;
	//..........................................................................................
			case 4:
				      
				        System.out.println("Enter starting range: ");
				        int a4=sc.nextInt();
				        System.out.println("Enter ending range: ");
				        int b4=sc.nextInt();
				        if(a4<b4){
				            while(a4<=b4){
				                if(a4%2==0){
				                    System.out.print(a4+" ");
				                }
				                a4++;
				            }
				            
				        }else{
				            System.out.print("INVALID RANGE");
				        }
				break;
	//..............................................................................................
			case 5:
				     
				        System.out.println("Enter degree to convert into farenheat(F): ");
				        int degree=sc.nextInt();
				        double faren=(degree*1.8)+32;
				        System.out.printf("%.1fF",faren);
				break;
	//..............................................................................................
			case 6:
				       
				        System.out.println("Enter kg to convert into grams: ");
				        float kg=sc.nextFloat();
				        int grams=(int)(kg*1000);
				        System.out.print(grams+" Grams");
				break;
	//...................................................................................
			case 7:
				       
				        System.out.println("Enter a value between 0 to 100: ");
				        int a7=sc.nextInt();
				        if(a7>=0 && a7<=100){
				            //.........
				            if(a7>=91 && a7<=100){
				                System.out.print("SUPER SMART");
				            }else if(a7>=81 && a7<=90){
				                System.out.print("SMART");
				            }else if(a7>=71 && a7<=80){
				                System.out.print("SMART ENOUGH");
				            }else if(a7>=61 && a7<=70){
				                System.out.print("JUST SMART");
				            }else if(a7>=36 && a7<=60){
				                System.out.print("NO SMART");
				            }else{
				                System.out.print("DUMB");
				            }
				            //.........
				        }else{
				            System.out.print("INVALID INPUT");
				        }
				break;
	//..........................................................................................................
			case 8:
				
				      
				        System.out.println("Enter value between 10 to 100: ");
				        int a8=sc.nextInt();
				        int count8=0;
				        if(a8>=10 && a8<=100){
				                while(count8<a8){
				                    System.out.println("JAVA AUTOMATION");
				                    count8++;
				                }
				         
				        }else{
				            System.out.print("Invalid Input");
				        }
				    
				
				break;
	//........................................................................................................
			case 9:
				        
				        System.out.println("Enter number between 100 t0 1000: ");
				        int a9=sc.nextInt();
				        if(a9>=100 && a9<=1000){
				            if(a9%2==0){
				                int even=a9%3;
				                System.out.print(even);
				            }else{
				                int odd=a9%2;
				                System.out.print(odd);
				            }
				        }else{
				            System.out.print("WRONG NUMBER");
				        }
				break;
	//.....................................................................................................................
			case 10:
				       
				        System.out.println("Enter starting range: ");
				        int a10=sc.nextInt();
				        System.out.println("Enter ending range: ");
				        int b10=sc.nextInt();
				        int count10=0;
				        if(a10<b10){
				            while(a10<=b10){
				                if(a10%11==0){
				                    count10++;
				                   System.out.print(a10+" "); 
				                }
				                a10++;     
				            }
				            if(count10==0){
				                System.out.print("NO NUMBERS");
				            }
				        }else{
				            System.out.print("INVALID RANGE");
				        }
				break;
	//...................................................................................................
			case 11:
				       
				        System.out.println("Enter starting range: ");
				        int a11=sc.nextInt();
				        System.out.println("Enter ending range: ");
				        int b11=sc.nextInt();
				        if(a11<b11){
				        for(int i11=a11;i11<=b11;i11++){
				            if(i11%2==1){
				                System.out.print(i11+" ");
				            }
				        }
				        }else{
				            System.out.print("INVALID RANGE");
				        }
				break;
	//......................................................................................................
			case 12:
				      
				        System.out.println("Enter starting range: ");
				        int a12=sc.nextInt();
				        System.out.println("Enter ending range: ");
				        int b12=sc.nextInt();
				        int sum12=0;
				        int count12=0;
				        if(a12<b12){
				            for(int i12=a12+1;i12<b12;i12++){
				                if(i12%2==0){
				                    count12++;
				                    sum12=sum12+i12;
				                }
				            }if(count12==0){
				                System.out.print("NO NUMBERS");
				            }else{
				                System.out.print("Total sum:"+sum12);
				            }
				        }else{
				            System.out.print("INVALID RANGE");
				        }
				break;
	//.......................................................................................................
			case 13:
				        
				        System.out.println("Enter starting range: ");
				        int a13=sc.nextInt();
				        System.out.println("Enter ending range:   ");
				        int b13=sc.nextInt();
				        int sum13=0;
				        int mul13=0;
				        if(a13<b13){
				            for(int i13=a13;i13<=b13;i13++){
				                mul13=i13*i13;
				                sum13=sum13+mul13;
				            }
				            System.out.print(sum13);
				        }else{
				            System.out.print("INVALID RANGE");
				        }
				break;
	//.........................................................................................................	
			case 14:
				        
				        System.out.println("Enter starting range: ");
				        int a14=sc.nextInt();
				        System.out.println("Enter ending range: ");
				        int b14=sc.nextInt();
				        int count14=0;
				        int c14=0;
				        if(a14>b14){
				            a14=(a14+b14)-(b14=a14);
				        }
				        for(int i14=a14;i14<=b14;i14++){
				            count14++;
				            if(count14!=1){
				                System.out.print(", ");
				            }
				            System.out.print(i14+"*"+(i14+1));
				        }
				        System.out.println();
				        for(int j14=a14;j14<=b14;j14++){
				            c14++;
				            if(c14!=1){
				                System.out.print(", ");
				            }
				            System.out.print(j14*(j14+1));
				        }
				break;
	//.........................................................................................................................
			case 15:
				        
				        System.out.println("Enter starting range: ");
				        int a15=sc.nextInt();
				        System.out.println("Enter ending range:   ");
				        int b15=sc.nextInt();
				        int count15=0;
				        int sum15=0;
				        if(a15<b15){
				            for(int i15=a15;i15<=b15;i15++){
				                if(i15%2==0){
				                    count15++;
				                    sum15=sum15+i15;
				                }
				                
				            }
				            float avg15=(float)sum15/count15;
				                System.out.printf("%.1f",avg15);
				        }else{
				            System.out.print("INVALID RANGE");
				        }
				break;
	//......................................................................................................
			case 16:
				      
				        System.out.println("Enter starting range: ");
				        int a16=sc.nextInt();
				        System.out.println("Enter ending range:   ");
				        int b16=sc.nextInt();
				        int count16=0;
				        if(a16>b16){
				            System.out.print("INVALID INPUTS");
				        }else{
				            for(int i16=a16;i16<=b16;i16++){
				                if(i16%2==0){
				                    count16++;
				                    if(count16%2==1){
				                        System.out.print(i16+" ");
				                    }
				                }
				            }if(count16==0){
				                System.out.print("NO NUMBERS");
				            }
				        }
				break;
	//.........................................................................................................................
			case 17:
				        
				        System.out.println("Enter starting range: ");
				        int a17=sc.nextInt();
				        System.out.println("Enter ending range:   ");
				        int b17=sc.nextInt();
				        int count17=0;
				        if(a17>0 && b17>0){
				            for(int i17=a17+1;i17<b17;i17++){
				                if(i17%2==0){
				                    count17++;
				                    if(count17%2==1){
				                        System.out.print(i17+" ");
				                    }
				                }
				            }
				        }else{
				            System.out.print("Invalid Inputs");
				        }
				break;
	//.................................................................................................................
			case 18:
				       
				        System.out.println("Enter starting range: ");
				        int a18=sc.nextInt();
				        System.out.println("Enter ending range: ");
				        int b18=sc.nextInt();
				        int count18=0;
				        if(a18>b18){
				            System.out.print("INVALID RANGE");
				        }else{
				            for(int i18=a18;i18<=b18;i18++){
				                if(i18%2==0){
				                    count18++;
				                }
				            }if(count18==0){
				                System.out.print("NO NUMBERS");
				            }else{
				                System.out.print(count18);
				            }
				        }
				break;
	//.....................................................................................................................
			case 19:
				      
				        System.out.println("Enter character: ");
				        char c19=sc.next().charAt(0);
				        for(char i19=c19;i19<=c19+25;i19++){
				            System.out.print(i19+" ");
				        }
				break;
	//.................................................................................................................
			case 20:
				       
				        System.out.println("Enter number of iterations you want: ");
				        int a20=sc.nextInt();
				        int count20=0;
				        for(int i20=1;i20<=a20;i20++){
				            count20++;
				            if(count20!=1){
				                System.out.print(",");
				            }
				            System.out.print("A,B");
				        }
				break;
	//..............................................................................................
			case 21:
				
				       
				        System.out.println("Enter starting rage: ");
				        float f121=sc.nextFloat();
				        System.out.println("Enter ending range: ");
				        float f221=sc.nextFloat();
				        int count21=0;
				        for(float  i21=f121;i21<=f221;i21+=0.2){
				            count21++;
				            if(count21!=1){
				                System.out.print(", ");
				            }
				            System.out.printf("%.1f^2",i21);
				        }
				        System.out.print(".");
				    
				

		break;
//..............................................................................................
			case 22:
				
				       
				        System.out.println("Enter starging range: ");
				        int a22=sc.nextInt();
				        System.out.println("Enter ending range: ");
				        int b22=sc.nextInt();
				        int count122=0;
				        int count222=0;
				        if(a22<b22){
				            for(int i22=a22;i22<=b22;i22++){
				                count122++;
				                if(count122!=1){
				                    System.out.print(", ");
				                }if(i22<0){
				                    System.out.print("5*("+i22+")");
				                }else{
				                    System.out.print("5*"+i22);
				                }
				                
				            }
				        }else{
				            for(int i22=a22;i22>=b22;i22--){
				                count222++;
				                if(count222!=1){
				                    System.out.print(", ");
				                }
				                if(i22<0){
				                    System.out.print("5*("+i22+")");
				                }else{
				                    System.out.print("5*"+i22);
				                }
				                
				                
				            }
				        }
				    
				

		break;
//..............................................................................................
			case 23:
				
				        System.out.println("Enter a value: ");
				        int n23=sc.nextInt();
				        int count23=1;
				        while(count23<=n23){
				            if(count23!=1){
				                System.out.print(", ");
				            }
				            if(count23%5==0){
				                System.out.print("divisible by five");
				            }else{
				                System.out.print(count23);
				            }
				            count23+=2;
				        }
				    
				
		break;
//..............................................................................................
			case 24:
				
				       
				        System.out.println("Enter starting range: ");
				        int n124=sc.nextInt();
				        System.out.println("Enter ending range: ");
				        int n224=sc.nextInt();
				        int count24=0;
				        if(n124>0 && n224>0){
				            for(int i24=n124;i24<=n224 ;i24+=100){
				            count24++;
				            if(count24!=1){
				                System.out.print(", ");
				            }
				            System.out.print(i24);
				        }
				        }else{
				            System.out.print("Invalid Inputs");
				        }
				        
				    
				
		break;
//..............................................................................................
			case 25:
				
				       
				        System.out.println("Enter a vlue: ");
				        int n25=sc.nextInt();
				        int count25=1;
				        while(count25<=n25){
				            if(count25!=1){
				                System.out.print(", ");
				            }if(count25%3==0){
				                System.out.print("factor of three");
				            }else{
				                System.out.print(count25);
				            }
				            count25++;
				        }
				    
				
		break;
//..............................................................................................
			case 26:
				
				        
				        System.out.println("Enter a value: ");
				        int n26=sc.nextInt();
				        int count26=0;
				        if(n26>0){
				          for(int i26=1;i26<=n26;i26++){
				            count26++;
				            if(count26!=1){
				                System.out.print(", ");
				            }
				            if(i26%2==0){
				                System.out.print(10);
				            }else{
				                System.out.print(5);
				            }
				        }  
				        }else{
				            System.out.print("Invalid Input");
				        }
				        
				        
				    
				
		break;
//..............................................................................................
			case 27:
				
				       
				        System.out.println("Enter a value: ");
				        int n27=sc.nextInt();
				        int count27=1;
				        while(count27<=n27){
				            if(count27!=1){
				                System.out.print(", ");
				            }if(count27%2==0){
				                System.out.print("even");
				            }else{
				                System.out.print(count27);
				            }
				            count27++;
				        }
				    
				
		break;
//..............................................................................................
			case 28:
				
				        
				        System.out.println("Enter starting ragne: ");
				        int n128=sc.nextInt();
				        System.out.println("Enter ending range: ");
				        int n228=sc.nextInt();
				        int count128=0;
				        int count228=0;
				        if(n128<n228){
				            for(int i28=n128;i28<=n228;i28++){
				                count128++;
				                if(count128!=1){
				                    System.out.print(", ");
				                }
				                    if(i28<0){
				                        System.out.print("("+(i28*5)+")");
				                    }else{
				                        System.out.print(i28*5);
				                    }
				            }
				        }else{
				            for(int i28=n128;i28>=n228;i28--){
				                count228++;
				                if(count228!=1){
				                    System.out.print(", ");
				                }if(i28<0){
				                    System.out.print("("+(i28*5)+")");
				                }else{
				                    System.out.print(i28*5);
				                }
				            }
				        }
				    
				
		break;
//..............................................................................................
			case 29:
				
				      
				        System.out.println("Enter starting range: ");
				        int n129=sc.nextInt();
				        System.out.println("Enter ending range: ");
				        int n229=sc.nextInt();
				        int count129=0;
				        int count229=0;
				        if(n129<n229){
				            for(int i29=n129;i29<=n229;i29++){
				                count129++;
				                if(count129!=1){
				                    System.out.print(",");
				                }
				                System.out.print(i29+"@"+(i29+1));
				            }
				        }else{
				            for(int i29=n129;i29>=n229;i29--){
				                count229++;
				                if(count229!=1){
				                    System.out.print(",");
				                }
				                System.out.print(i29+"@"+(i29-1));
				            }
				        }
				    
				
		break;
//..............................................................................................
			case 30:
				
				
				       
				        int n30=sc.nextInt();
				        int count30=0;
				        if(n30>0){
				            for(int i30=1;i30<=n30;i30++){
				                if(n30%i30==0){
				                    count30++;
				                }
				            }if(count30==2){
				                System.out.print("Prime Number");
				            }else{
				System.out.print("Not a Prime Number");
				            }
				        }else{
				            System.out.print("Invalid Input");
				        }
				    
				

				    
				
		break;
//..............................................................................................
			case 31:
				
				
				      
				        System.out.println("Enter starting range: ");
				        int n131=sc.nextInt();
				        System.out.println("Enter ending range: ");
				        int n231=sc.nextInt();
				        int c31=0;
				        int sum31=0;
				        if(n131>0 && n231>0){
				            for(int i31=n131+1;i31<n231;i31++){
				                int count31=0;
				                for(int j31=1;j31<=n231;j31++){
				                    if(i31%j31==0){
				                        count31++;
				                    }
				                }if(count31==2){
				                    sum31=sum31+i31;
				                    c31++;
				                }
				            }float avg31=(float)sum31/c31;
				            System.out.printf("%.3f",avg31);
				        }else{
				            System.out.print("Invalid Inputs");
				        }
				    
				

				    
				
		    
		
break;
//..............................................................................................
			case 32:
				
				
				
				      
				        System.out.println("Enter starting range: ");
				        int n132=sc.nextInt();
				        System.out.println("Enter ending range: ");
				        int n232=sc.nextInt();
				        if(n132>n232){
				            n132=n132+n232-(n232=n132);
				        }
				        int c32=0;
				        int co32=0;
				        int sum32=0;
				        if(n132>0 && n232>0){
				            for(int i32=n132+1;i32<n232;i32++){
				                int count32=0;
				                for(int j32=1;j32<=n232;j32++){
				                    if(i32%j32==0){
				                        count32++;
				                    }
				                }if(count32==2){
				                    c32++;
				                    if(c32%2==1){
				                        sum32=sum32+i32;
				                        co32++;
				                    }
				                }
				            }if(co32==0){
				                System.out.print("No Prime Numbers");
				            }else{
				                float avg32=(float)sum32/co32;
				            System.out.printf("%.3f",avg32);
				            }
				        }else{
				            System.out.print("Invalid Inputs");
				        }
				        
				    
				
		
break;
//..............................................................................................
			case 33:
				
			
				
				      
				        System.out.println("Enter first value: ");
				        int n133=sc.nextInt();
				        System.out.println("Enter second value: ");
				        int n233=sc.nextInt();
				        n133=n133+n233-(n233=n133);
				        System.out.println("first value: "+n133);
				        System.out.print("second value: "+n233);
				    
			
		
break;
//..............................................................................................
			case 34:
				
				
				       
				        System.out.println("Enter starting value: ");
				        int n134=sc.nextInt();
				        System.out.println("Enter ending value: ");
				        int n234=sc.nextInt();
				        int c34=0;
				        int sum34=0;
				        if(n134>0 && n234>0){
				            for(int i34=n134+1;i34<n234;i34++){
				                int count34=0;
				                for(int j34=1;j34<=n234;j34++){
				                    if(i34%j34==0){
				                        count34++;
				                    }
				                }if(count34==2){
				                    c34++;
				                    if(c34%2==1){
				                        sum34=sum34+i34;
				                    }
				                }
				            }if(c34==0){
				                System.out.print("No Prime Numbers");
				            }else{
				                System.out.print("Total sum"+sum34);
				            }
				        }else{
				            System.out.print("Invalid Inputs");
				        }
				        
				    
				  
				
		
break;
//..............................................................................................
			case 35:
				
				
				       
				        System.out.println("Enter starting value: ");
				        int n135=sc.nextInt();
				        System.out.println("Enter ending value: ");
				        int n235=sc.nextInt();
				        int c35=0;
				        int co35=0;
				        if(n135>0 && n235>0){
				            for(int i35=n135;i35<=n235;i35++){
				                int count35=0;
				                for(int j35=1;j35<=n235;j35++){
				                    if(i35%j35==0){
				                        count35++;
				                    }
				                }if(count35==2){
				                    c35++;
				                    if(c35%2==1){
				                        co35++;
				                        if(co35!=1){
				                          System.out.print(", ");
				                            
				                        }System.out.print(i35);
				                    }
				                }
				            }
				        }else{
				            System.out.print("Invalid Inputs");
				        }
				    
				
				

		
break;
//..............................................................................................
			case 36:
				
				
				
				        System.out.println("Enter a value: ");
				        int n36=sc.nextInt();
				        int count36=0;
				        if(n36>0){
				            for(int i36=1;i36<=n36;i36++){
				                if(n36%i36==0){
				                    count36++;
				                }
				            }if(count36==2){
				                System.out.print("Prime Number");
				            }else{
				                System.out.print("Not a Prime Number");
				            }
				        }else{
				            System.out.print("Invalid Input");
				        }
				    
				
		
break;
//..............................................................................................
			case 37:
				
				
				
				        
				        System.out.println("Enter starting value: ");
				        int n137=sc.nextInt();
				        System.out.println("Enter ending value: ");
				        int n237=sc.nextInt();
				        int c37=0;
				        if(n137>0 && n237>0){
				            for(int i37=n137;i37<=n237;i37++){
				                int count37=0;
				                for(int j37=1;j37<=n237;j37++){
				                    if(i37%j37==0){
				                        count37++;
				                    }
				                }if(count37==2){
				                    c37++;
				                    if(c37!=1){
				                        System.out.print(", ");
				                    }
				                    System.out.print(i37);
				                }
				            }
				        }else{
				            System.out.print("Invalid Inputs");
				        }
				    
				
				    
			
				
		
break;
			case 38:
				
				       
				        System.out.println("Enter a value: ");
				        int n38=sc.nextInt();
				        int co38=0;
				        if(n38<0){
				            n38=-n38;
				        }
				        if(n38==0){
				            System.out.print("Invalid Input");
				        }else{
				            for(int i38=1;i38<=n38;i38++){
				                int count38=0;
				                if(n38%i38==0){
				                    for(int j38=1;j38<=n38;j38++){
				                        if(i38%j38==0){
				                            count38++;
				                        }
				                    }
				                }if(count38==2){
				                    co38++;
				                    System.out.print(i38+" ");
				                }
				            }if(co38==0){
				                System.out.print("No Prime Factors");
				            }
				        }
				    
				
				break;
			case 39:
				
				      
				        System.out.println("Enter starting range: ");
				        int n139=sc.nextInt();
				        System.out.println("Enter ending range: ");
				        int n239=sc.nextInt();
				        int sum39=0;
				        if(n139>0 && n239>0){
				            for(int i39=n139+1;i39<n239;i39++){
				                int count39=0;
				                for(int j39=1;j39<=n239;j39++){
				                    if(i39%j39==0){
				                        count39++;
				                    }
				                }if(count39==2){
				                    sum39=sum39+i39;
				                }
				            }System.out.print(sum39);
				        }else{
				            System.out.print("Invalid Inputs");
				        }
				    
			

				break;
			case 40:
				
				       
				        System.out.println("Enter a value: ");
				        int n40=sc.nextInt();
				        if(n40>0){
				            for(int i40=1;i40<=n40;i40++){
				            if(n40%i40==0){
				                System.out.print(i40+" ");
				            }
				        }
				        }else{
				            System.out.print("Invalid Input");
				        }
				        
				    
				

				break;
			case 41:
				
				    System.out.println("Enter a number: ");
				      int n41=sc.nextInt();
				      int dn41=n41;
				      int ap41=0;
				      int bp41=0;
				      int aap41=0;
				      int bbp41=0;
				      if(n41>0){
				          for(int i41=n41+1;true;i41++){
				              int count41=0;
				              for(int j41=1;j41<=i41;j41++){
				                  if(i41%j41==0){
				                  count41++;
				              }
				              }if(count41==2){
				                  ap41=i41;
				                  aap41=ap41;
				                  break;
				              }
				              
				          }for(int i41=n41-1;i41>=1;i41--){
				              int c41=0;
				              for(int j41=1;j41<=i41;j41++){
				                  if(i41%j41==0){
				                      c41++;
				                  }
				              }if(c41==2){
				                  bp41=i41;
				                  bbp41=bp41;
				                  break;
				              }
				          }
				          int x41=ap41-dn41;
				          int y41=dn41-bp41;
				          if(x41>y41){
				              System.out.print("Nearest prime is: "+bbp41);
				          }else if(y41>x41){
				              System.out.print("Nearest prime is: "+aap41);
				          }else{
				        	  System.out.println("Nearest prime numbers: ");
				              System.out.println(bbp41);
				              System.out.print(aap41);
				          }
				      }else{
				System.out.print("InValid Input");
				      }
				    
				

				break;
			case 42:
				
				System.out.println("Enter starting range: ");
				        int n142=sc.nextInt();
				        System.out.println("Enter ending range: ");
				        int n242=sc.nextInt();
				        n142=(n142+n242)-(n242=n142);
				        System.out.println(n142);
				        System.out.println(n242);
				    
				

				break;
			case 43:
				System.out.println("Enter a volue: ");
				        int n43=sc.nextInt();
				        int dn43=1;
				        int mul43=1;
				        if(n43>=0){
				            while(dn43<=n43){
				            mul43=(mul43*dn43);
				            dn43++;
				        }
				        System.out.print(mul43);
				        }else{
				System.out.print("Invalid InPut");
				        }
				        
				    
				

				break;
			case 44:
				System.out.println("Enter starting range: ");
				        int n144=sc.nextInt();
				        System.out.println("Enter ending rane: ");
				        int n244=sc.nextInt();
				        if(n144>n244){
				            n144=(n144+n244)-(n244=n144);
				        }
				        int a44=0;
				        int b44=1;
				        int c44;
				        int count44=0;
				        if(n144>=0 &&  n244>=0){
				            for(int i44=1;i44<=n244;i44++){
				        while(a44>=n144 && a44<=n244){
				        System.out.print(a44+" ");
				        count44++;
				                c44=a44+b44;
				                a44=b44;
				                b44=c44;
				                }
				                c44=a44+b44;
				                a44=b44;
				                b44=c44;
				            }if(count44==0){
				System.out.print("No Fibonacci Series Values");
				            }
				        }else{
				System.out.print("Invalid Inputs");
				        }
				    
			
				break;
			case 45:
				System.out.println("Enter a value: ");
				    int n45=sc.nextInt();
				    int a45=0,b45=1,c45;
				    int sum45=0;
				    if(n45>0){
				        for(int i45=1;i45<=n45;i45++){
				            sum45=sum45+a45;
				            c45=a45+b45;
				            a45=b45;
				            b45=c45;
				        }
				        System.out.print(sum45);
				    }else{
				        System.out.print("Invalid Input");
				    }
				    
				

				break;
			case 46:
				System.out.println("Enter a value: ");
				        int n46=sc.nextInt();
				        int c46=0;
				        int sum46=0;
				        if(n46>=0){
				            for(int i46=0;i46<=n46;i46++){
				                int mul46=1;
				                for(int j46=1;j46<=i46;j46++){
				                    mul46=mul46*j46;
				                    
				                }c46++;
				                    if(c46!=1){
				            System.out.print("+");
				                    }
				                System.out.print(mul46);
				                sum46=sum46+mul46;
				            }
				            System.out.print("="+sum46);
				        }else{
				    System.out.print("INvalid INput");
				        }
				    
				
				break;
			case 47:
				System.out.println("Enter starting rane: ");
				int n147=sc.nextInt();
				System.out.println("Enter ending range: ");
				int n247=sc.nextInt();
				int co47=0;
				int a47=0,b47=1,c47;
				int count47=0;
				int sum47=0;
				if(n147>n247){
				    n147=(n147+n247)-(n247=n147);
				}
				if(n147>=0 && n247>=0){
				    for(int i47=n147;i47<n247;i47++){
				        while(a47>=n147 && a47<=n247){
				            co47++;
				            if(co47%2==1){
				                sum47=sum47+a47;
				                count47++;
				            }
				            c47=a47+b47;
				            a47=b47;
				            b47=c47;
				        }
				        c47=a47+b47;
				        a47=b47;
				        b47=c47;
				    }if(count47==0){
				System.out.print("No Fibonacci Series Values");
				    }else{
				        float avg47=(float)sum47/count47;
				    System.out.printf("%.2f",avg47);
				    }
				    
				}else{
				System.out.print("Invalid Inputs");
				}
				    
				

				break;
			case 48:
				
				System.out.println("Enter a value: ");
				int n48=sc.nextInt();
				int a48=0,b48=1,c48;
				if(n48<0){
				    n48=-n48;
				}
				if(n48==0){
				    System.out.print("Invalid Input");
				}else{
				    for(int i48=1;i48<=n48;i48++){
				        System.out.print(a48+" ");
				        c48=a48+b48;
				        a48=b48;
				        b48=c48;
				    }
				}

				    
				
				break;
			case 49:
				
				 System.out.println("Enter a value: ");
				    int n49=sc.nextInt();
				    int a49=0,b49=1,c49;
				    int count49=0;
				    int co49=0;
				    if(n49<0){
				        n49=-n49;
				    }
				    if(n49==0){
				    System.out.print("Invalid Input");
				    }else{
				        for(int i49=1;i49<=n49*2;i49++){
				            count49++;
				            if(count49%2==1){
				                co49++;
				                if(co49!=1){
				            System.out.print(", ");
				                }
				                System.out.print(a49);
				            }
				            c49=a49+b49;
				            a49=b49;
				            b49=c49;
				        }
				    }
				

				
				break;
			case 50:
				System.out.println("Enter starting range: ");
				int n150=sc.nextInt();
				System.out.println("Enter ending range: ");
				int n250=sc.nextInt();
				if(n150>n250){
				    n150=(n150+n250)-(n250=n150);
				}
				int a50=0,b50=1,c50;
				int count50=0;
				int sum50=0;
				if(n150>=0 && n250>=0){
				    for(int i50=n150;i50<=n250;i50++){
				        while(a50>=n150 && a50<=n250){
				            sum50=sum50+a50;
				            count50++;
				            c50=a50+b50;
				            a50=b50;
				            b50=c50;
				        }
				        c50=a50+b50;
				        a50=b50;
				        b50=c50;
				    }if(count50==0){
				        System.out.print("No Fibonacci Series Values");
				    }else{
				        float avg50=(float)sum50/count50;
				        System.out.printf("%.2f",avg50);
				    }
				}else{
				System.out.print("Invalid Inputs");
				}
				    
				

				break;
			case 51:
				System.out.println("Enter a value: ");
				        int n51=sc.nextInt();
				        int c51=0;
				        if(n51>0){
				            for(int i51=1;i51<=n51;i51++){
				                int mul51=0;
				                mul51=i51*i51;
				                if(mul51==n51){
				System.out.print("Given Number is a Perfect Square.");
				c51++;
				break;
				                }
				            }if(c51==0){
				                System.out.print("Given Number is Not a Perfect Square.");
				            }
				        }else{
				            System.out.print("InvaliD Input");
				        }
				    
			
				break;
			case 52:
				System.out.println("Enter a value: ");
				        int n52=sc.nextInt();
				        int dn52=n52;
				        int rem52=0;
				        if(n52==0){
				            System.out.print("Zero");
				        }else if(n52>=0){
				            while(n52>0){
				               int r52=n52%10;
				                n52=n52/10;
				                rem52=rem52*10+r52;
				            }if(dn52==rem52){
				                System.out.print("Given Number is Palindrome");
				            }else{
				                System.out.print("Reverse of a Given Number is "+rem52);
				            }
				        }else{
				            System.out.print("Invalid Input");
				        }
				    
				

				break;
			case 53:
				System.out.println("Enter a value: ");
				        int n53=sc.nextInt();
				        int rem53=0;
				        if(n53>0){
				            while(n53>0){
				              int r53=n53%10;
				                n53=n53/10;
				                rem53=rem53*10+r53;
				            }
				            System.out.print(rem53);
				        }else{
				            System.out.print("InValid Input");
				        }
				    
				
				break;
			case 54:
				System.out.println("Enter a value: ");
				        int n54=sc.nextInt();
				        int dn54=n54;
				        int rem54=0;
				        if(n54>0){
				            while(n54>0){
				            int r54=n54%10;
				                n54=n54/10;
				                rem54=rem54*10+r54;
				            }if(dn54==rem54){
				                System.out.print("Palindrome");
				            }else{
				         System.out.print("Not a Palindrome");
				            }
				        }else{
				            System.out.print("InvAlid Input");
				        }
				    
				
				break;
			case 55:
				System.out.println("Enter starting range: ");
				        int n155=sc.nextInt();
				        System.out.println("Enter ending range: ");
				        int n255=sc.nextInt();
				        int count55=0;
				        int sum55=0;
				        if(n155<0){
				            n155=-n155;
				        }
				        if(n255<0){
				            n255=-n255;
				        }
				        if(n155==0 || n255==0){
				System.out.print("INVALID Inputs");
				        }else if(n155>n255){
				            System.out.print("Given Inputs are Swapped");
				        }else{
				            for(int i55=n155;i55<=n255;i55++){
				                int di55=0;
				                di55=i55;
				                int ddi55=di55;
				                int rem55=0;
				                int r55=0;
				                while(di55>0){
				                    r55=di55%10;
				                    di55=di55/10;
				                    rem55=rem55*10+r55;
				                }if(rem55==ddi55){
				                    count55++;
				                    sum55=sum55+ddi55;
				                }
				            }if(count55==0){
				                System.out.print("No Palindrome Values");
				            }else{
				                float avg55=(float)sum55/count55;
				            System.out.printf("%.2f",avg55);
				            }
				            
				        }
				        
				    
				

				break;
			case 56:
				System.out.println("Enter starting value: ");
				        int n156=sc.nextInt();
				        System.out.println("Enter ending range: ");
				        int n256=sc.nextInt();
				        int count56=0;
				        if(n156>n256){
				            n156=(n156+n256)-(n256=n156);
				        }
				        if(n156>=0 && n256>=0){
				            for(int i56=n156+1;i56<n256;i56++){
				                int di56=0;
				                di56=i56;
				                int rem56=0;
				                int r56=0;
				                while(di56>0){
				                    r56=di56%10;
				                    di56=di56/10;
				                    rem56=rem56*10+r56;
				                }if(rem56==i56){
				                    count56++;
				                    System.out.println(rem56);
				                }
				            }if(count56==0){
				                System.out.print("No Palindrome Values");
				            }
				        }else{
				            System.out.print("InvaliD InputS");
				        }
				    
				
				break;
				

			default: 
				System.out.println("i'm sorry Enter proper number!........................... ");
			  
				break;
				
			}//SWITCH END HERE
		}//1 METHOD END HERE
	

}