import pytest

@pytest.fixture
def list_value():
    ls = [i for i in range(11)]
    return ls