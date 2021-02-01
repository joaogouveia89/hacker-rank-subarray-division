require 'colorize'

def birthday s, d, m
	ways = 0
	sum = 0
	s.each_with_index do |el, idx|
		if (idx + m > s.size())
			break
		end
		(idx...(idx + m)).each_with_index do |curIdx|
			sum = sum + s[curIdx]
		end
		if sum == d
			ways = ways + 1
		end
		sum = 0
	end
	return ways
end

#input
input00 = File.open("../../test-cases/input/input00.txt")
input01 = File.open("../../test-cases/input/input01.txt")
input02 = File.open("../../test-cases/input/input02.txt")

data = input00.map(&:chomp)
s00 = data[1].split(" ").map(&:to_i)
d00 = data[2].split(" ")[0].to_i
m00 = data[2].split(" ")[1].to_i

data = input01.map(&:chomp)
s01 = data[1].split(" ").map(&:to_i)
d01 = data[2].split(" ")[0].to_i
m01 = data[2].split(" ")[1].to_i

data = input02.map(&:chomp)
s02 = data[1].split(" ").map(&:to_i)
d02 = data[2].split(" ")[0].to_i
m02 = data[2].split(" ")[1].to_i

# problem application
response00 = birthday s00, d00, m00
response01 = birthday s01, d01, m01
response02 = birthday s02, d02, m02

#expected outputs
output00File = File.open("../../test-cases/output/output00.txt")
output01File = File.open("../../test-cases/output/output01.txt")
output02File = File.open("../../test-cases/output/output02.txt")

data = output00File.map(&:chomp)
output00 = data[0].to_i

data = output01File.map(&:chomp)
output01 = data[0].to_i

data = output02File.map(&:chomp)
output02 = data[0].to_i

if response00 === output00
	puts "INPUT 00".green
else
	puts "INPUT 00".red
end

if response01 === output01
	puts "INPUT 01".green
else
	puts "INPUT 01".red
end

if response02 === output02
	puts "INPUT 02".green
else
	puts "INPUT 02".red
end