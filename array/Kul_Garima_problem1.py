#Given an array of integers, return indices of the two numbers such that they add up to a specific target.

#You may assume that each input would have exactly one solution, and you may not use the same element twice.

#Example:

# complexity in the given case ---------  O(n)

#Given

nums = [2, 7, 11, 15]
target = 9


#Because nums[0] + nums[1] = 2 + 7 = 9,
#return [0, 1]

#CODE

def twoNumberSum(array, target):
	values = {}
	for i in range(0, len(array)):
		match = target - array[i]
		if match in values:
			return[values[match],i]
		else:
			values[array[i]] = i
		i += 1
	return[]


print(twoNumberSum(nums, target))
