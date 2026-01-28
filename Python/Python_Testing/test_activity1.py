import pytest

def sum(a,b):
    return a+b

def testsum():
    a = 23
    b = 53
    assert sum(a,b) == 76

def test_sum_negative_numbers():
    assert sum(-10, -5) == -15

def test_sum_mixed_signs():
    assert sum(20, -8) == 12

def test_sum_zeros():
    assert sum(0, 0) == 0

def test_sum_with_zero():
    assert sum(42, 0) == 42

def test_sum_large_numbers():
    assert sum(1000000, 2000000) == 3000000

def test_sum_floats():
    assert sum(3.5, 2.5) == 6.0
