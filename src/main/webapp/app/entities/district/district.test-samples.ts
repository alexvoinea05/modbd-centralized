import { IDistrict, NewDistrict } from './district.model';

export const sampleWithRequiredData: IDistrict = {
  id: 85653,
};

export const sampleWithPartialData: IDistrict = {
  id: 58438,
  name: 'invoice',
};

export const sampleWithFullData: IDistrict = {
  id: 69401,
  name: 'connect Fresh real-time',
  region: 'navigating',
};

export const sampleWithNewData: NewDistrict = {
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
