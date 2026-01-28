import pytest

@pytest.fixture
def list_value():
    n = 10
    ls = [i for i in range(n+1)]
    return ls