# Extension Validation Report

- Extension: tachiyomi-th.finmanga-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 33
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 3
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 7656859857051979814
- Source name: Fin Manga
- Source language: th
- Selected manga input: popular offset 0: Payment for the Ride รักครั้งนี้ ขอจ่ายด้วยหัวใจฉัน (`.../payment-for-the-ride`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Payment for the Ride รักครั้งนี้ ขอจ่ายด้วยหัวใจฉัน (`.../payment-for-the-ride`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Payment for the Ride รักครั้งนี้ ขอจ่ายด้วยหัวใจฉัน (`.../payment-for-the-ride`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Payment for the Ride รักครั้งนี้ ขอจ่ายด้วยหัวใจฉัน (`.../payment-for-the-ride`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Payment for the Ride รักครั้งนี้ ขอจ่ายด้วยหัวใจฉัน (`.../payment-for-the-ride`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 20 | Payment for the Ride รักครั้งนี้ ขอจ่ายด้วยหัวใจฉัน (`.../payment-for-the-ride`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Payment for the Ride รักครั้งนี้ ขอจ่ายด้วยหัวใจฉัน (`.../payment-for-the-ride`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 42 | ตอนที่ 1 (`.../payment-for-the-ride-%E0%B8%95%E0%B8%AD%E0%B8%99%E0%B8%97%E0%B8%B5%E0%B9%88-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 115 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Payment for the Ride รักครั้งนี้ ขอจ่ายด้วยหัวใจฉัน, URL=`.../payment-for-the-ride` |  |  |  |
| latest differs from popular | LINT | Latest page 1 exactly matches popular page 1; verify supportsLatest |  |  |  |
| popular pagination | FAIL | Page 2 matches page 1 exactly | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest pagination | FAIL | Page 2 matches page 1 exactly | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 100/100 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 100/100 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.fin-manga.com/.../Payment-for-the-Ride.jpg` (image/jpeg, 38137 bytes, 400x562) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../payment-for-the-ride` |  |  |  |
| details thumbnail URL | FAIL | Thumbnail URL `data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7` is not an absolute HTTP(S) URL (data scheme) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details author | PASS | Enhyol |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Adult, Josei, Romance, Smut, มังงะจบแล้ว, มังงะเกาหลี, โรแมนซ์, โรแมนติก, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | เรื่องย่อ Payment for the Ride รักครั้งนี้ ขอจ่ายด้วยหัวใจฉัน แปลไทย “ดาอึน” พลาดรถเมประจำหมู่บ้านที่ให้บริการเพียง 2 ครั้งต่อวัน ทำให้เธอตัดสินใจเดินเพื่อกลับไปยังหมู่บ้านที่ตั้งอยู่ในป่าลึกกลางหุบเขาของเธอ แสงแดดในฤดูร้อนแผดเผาจนเหงื่อซึมออกมาทำให้เสื้อผ้าชื้นแฉะไปหมด ระหว่างที่เธอกำลังก้าวเท้าอย่างเหนื่อยล้าอยู่นั้น อยู่ ๆ ก็มีชายผู้หนึ่งที่อยู่ ๆ ก็มาปรากฏตัวในหมู่บ้านจอดรถให้ ดาอึนจึงยื่นกางเกงในที่เธอใส่ให้เขาเป็นค่ารถ….<br><br>Alternative Names: <br>- Ahjussi Aku akan bayar ongkosnya<br>- Ajeossi I'll Give You the Car Fare<br>- Chú À Tôi Sẽ Trả Tiền Xe Cho Chú<br>- Mister I'll pay for the ride<br>- Payment for the Ride<br>- รักครั้งนี้ ขอจ่ายด้วยหัวใจฉัน<br>- おじさん、タクシー代払います<br>- 大叔，給你車費<br>- 아저씨 차비 드릴게요 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 42 chapters |  |  |  |
| chapter dates | PASS | 42 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 115 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://www.fin-manga.com/.../Payment-for1001.jpg` (image/jpeg, 31444 bytes, 797x972) |  |  |  |
