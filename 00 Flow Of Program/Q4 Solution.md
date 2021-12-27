# Question 4 Solution
>Take 2 numbers as inputs and find their HCF and LCM.

## Flow Chart

<a href="https://ibb.co/cc5YK9s"><img src="https://i.ibb.co/QFBD7Vx/Q4-Flow-Chart.png" alt="Q4-Flow-Chart" border="0"></a>

## Pseudo Code

```
Start
input x,y,lcm,hcf
if x>y:
    lcm=x
else:
    lcm=y
while True:
    if lcm%x = 0 and lcm%y = 0:
        break:
    else:
        lcm=lcm+1
hcf = (x*y)/lcm
output lcm,hcf
End
```