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