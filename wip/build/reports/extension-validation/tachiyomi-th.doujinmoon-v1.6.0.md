# Extension Validation Report

- Extension: tachiyomi-th.doujinmoon-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 1953904877869380978
- Source name: Doujin Moon
- Source language: th
- Selected manga input: popular offset 0: เกิดใหม่ก็ได้สกิลโกงไว้เย็ดสาวในต่างโลก [Seisui BAR] Isekai Tensei Shite Nouryoku de H na Koto suru Hanashi (`.../%E0%B9%80%E0%B8%81%E0%B8%B4%E0%B8%94%E0%B9%83%E0%B8%AB%E0%B8%A1%E0%B9%88%E0%B8%81%E0%B9%87%E0%B9%84%E0%B8%94%E0%B9%89%E0%B8%AA%E0%B8%81%E0%B8%B4%E0%B8%A5%E0%B9%82%E0%B8%81%E0%B8%87%E0%B9%84%E0%B8%A7`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | เกิดใหม่ก็ได้สกิลโกงไว้เย็ดสาวในต่างโลก [Seisui BAR] Isekai Tensei Shite Nouryoku de H na Koto suru Hanashi (`.../%E0%B9%80%E0%B8%81%E0%B8%B4%E0%B8%94%E0%B9%83%E0%B8%AB%E0%B8%A1%E0%B9%88%E0%B8%81%E0%B9%87%E0%B9%84%E0%B8%94%E0%B9%89%E0%B8%AA%E0%B8%81%E0%B8%B4%E0%B8%A5%E0%B9%82%E0%B8%81%E0%B8%87%E0%B9%84%E0%B8%A7`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | ผมเจอเพื่อนสมัยเรียนที่ร้านลามก [MM] How I Met my Old Classmate at an Adult Service Place (`.../%E0%B8%9C%E0%B8%A1%E0%B9%80%E0%B8%88%E0%B8%AD%E0%B9%80%E0%B8%9E%E0%B8%B7%E0%B9%88%E0%B8%AD%E0%B8%99%E0%B8%AA%E0%B8%A1%E0%B8%B1%E0%B8%A2%E0%B9%80%E0%B8%A3%E0%B8%B5%E0%B8%A2%E0%B8%99%E0%B8%97%E0%B8%B5`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | นอกใจก่อนเอง [Punifuka Ume] You were the one who cheated first (`.../%E0%B8%99%E0%B8%AD%E0%B8%81%E0%B9%83%E0%B8%88%E0%B8%81%E0%B9%88%E0%B8%AD%E0%B8%99%E0%B9%80%E0%B8%AD%E0%B8%87-punifuka-ume-you-were-the-one-who-cheated-first`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | ความผันผวนของห้องเสื่อทาทามิ [Shoukaki] Fluctuations in a tatami room (`.../%E0%B8%84%E0%B8%A7%E0%B8%B2%E0%B8%A1%E0%B8%9C%E0%B8%B1%E0%B8%99%E0%B8%9C%E0%B8%A7%E0%B8%99%E0%B8%82%E0%B8%AD%E0%B8%87%E0%B8%AB%E0%B9%89%E0%B8%AD%E0%B8%87%E0%B9%80%E0%B8%AA%E0%B8%B7%E0%B9%88%E0%B8%AD`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | เกิดใหม่ก็ได้สกิลโกงไว้เย็ดสาวในต่างโลก [Seisui BAR] Isekai Tensei Shite Nouryoku de H na Koto suru Hanashi (`.../%E0%B9%80%E0%B8%81%E0%B8%B4%E0%B8%94%E0%B9%83%E0%B8%AB%E0%B8%A1%E0%B9%88%E0%B8%81%E0%B9%87%E0%B9%84%E0%B8%94%E0%B9%89%E0%B8%AA%E0%B8%81%E0%B8%B4%E0%B8%A5%E0%B9%82%E0%B8%81%E0%B8%87%E0%B9%84%E0%B8%A7`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | เกิดใหม่ก็ได้สกิลโกงไว้เย็ดสาวในต่างโลก [Seisui BAR] Isekai Tensei Shite Nouryoku de H na Koto suru Hanashi (`.../%E0%B9%80%E0%B8%81%E0%B8%B4%E0%B8%94%E0%B9%83%E0%B8%AB%E0%B8%A1%E0%B9%88%E0%B8%81%E0%B9%87%E0%B9%84%E0%B8%94%E0%B9%89%E0%B8%AA%E0%B8%81%E0%B8%B4%E0%B8%A5%E0%B9%82%E0%B8%81%E0%B8%87%E0%B9%84%E0%B8%A7`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 28 | ตอนที่ 1 - เทพธิดา (`.../%E0%B9%80%E0%B8%81%E0%B8%B4%E0%B8%94%E0%B9%83%E0%B8%AB%E0%B8%A1%E0%B9%88%E0%B8%81%E0%B9%87%E0%B9%84%E0%B8%94%E0%B9%89%E0%B8%AA%E0%B8%81%E0%B8%B4%E0%B8%A5%E0%B9%82%E0%B8%81%E0%B8%87%E0%B9%84%E0%B8%A7`) |  | <1s |
| pages | `getPageList(chapter)` | success | 5 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=เกิดใหม่ก็ได้สกิลโกงไว้เย็ดสาวในต่างโลก \[Seisui BAR\] Isekai Tensei Shite Nouryoku de H na Koto suru Hanashi, URL=`.../%E0%B9%80%E0%B8%81%E0%B8%B4%E0%B8%94%E0%B9%83%E0%B8%AB%E0%B8%A1%E0%B9%88%E0%B8%81%E0%B9%87%E0%B9%84%E0%B8%94%E0%B9%89%E0%B8%AA%E0%B8%81%E0%B8%B4%E0%B8%A5%E0%B9%82%E0%B8%81%E0%B8%87%E0%B9%84%E0%B8%A7` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://doujinmoon.com/.../1-4.jpg` (image/jpeg, 877905 bytes, 1280x1789) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../%E0%B9%80%E0%B8%81%E0%B8%B4%E0%B8%94%E0%B9%83%E0%B8%AB%E0%B8%A1%E0%B9%88%E0%B8%81%E0%B9%87%E0%B9%84%E0%B8%94%E0%B9%89%E0%B8%AA%E0%B8%81%E0%B8%B4%E0%B8%A5%E0%B9%82%E0%B8%81%E0%B8%87%E0%B9%84%E0%B8%A7` |  |  |  |
| details thumbnail URL | PASS | `https://doujinmoon.com/.../1-4.jpg` |  |  |  |
| details author | PASS | Seisui BAR |  |  |  |
| details artist | PASS | Seisui BAR |  |  |  |
| details genres | PASS | Adult ผู้ใหญ่, Big breast นมใหญ่, Comedy ตลก, Fantasy แฟนตาซี, ปีศาจ นางฟ้า แวมไพร์, สาวผมยาว, สาวหูสัตว์, โดจินเกาหลี มังฮวา 18+, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 28 chapters |  |  |  |
| chapter dates | PASS | 28 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 5 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://doujinmoon.com/.../1-5.jpg` (image/jpeg, 877905 bytes, 1280x1789) |  |  |  |
