import dayjs from 'dayjs/esm';

import { ITicket, NewTicket } from './ticket.model';

export const sampleWithRequiredData: ITicket = {
  id: 65582,
  finalPrice: 75353,
  quantity: 9016,
  time: dayjs('2023-05-09T05:35'),
};

export const sampleWithPartialData: ITicket = {
  id: 93545,
  finalPrice: 23104,
  quantity: 7730,
  time: dayjs('2023-05-09T16:48'),
};

export const sampleWithFullData: ITicket = {
  id: 4280,
  finalPrice: 9940,
  quantity: 77434,
  time: dayjs('2023-05-08T23:25'),
};

export const sampleWithNewData: NewTicket = {
  finalPrice: 94764,
  quantity: 48085,
  time: dayjs('2023-05-09T13:42'),
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
