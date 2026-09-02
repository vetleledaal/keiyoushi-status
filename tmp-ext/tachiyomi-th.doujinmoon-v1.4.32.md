# Extension Validation Report

- Extension: tachiyomi-th.doujinmoon-v1.4.32
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1953904877869380978
- Source name: Doujin Moon
- Source language: th
- Selected manga input: popular offset 0: เกิดใหม่ก็ได้สกิลโกงไว้เย็ดสาวในต่างโลก [Seisui BAR] Isekai Tensei Shite Nouryoku de H na Koto suru Hanashi (`.../%E0%B9%80%E0%B8%81%E0%B8%B4%E0%B8%94%E0%B9%83%E0%B8%AB%E0%B8%A1%E0%B9%88%E0%B8%81%E0%B9%87%E0%B9%84%E0%B8%94%E0%B9%89%E0%B8%AA%E0%B8%81%E0%B8%B4%E0%B8%A5%E0%B9%82%E0%B8%81%E0%B8%87%E0%B9%84%E0%B8%A7`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | เกิดใหม่ก็ได้สกิลโกงไว้เย็ดสาวในต่างโลก [Seisui BAR] Isekai Tensei Shite Nouryoku de H na Koto suru Hanashi (`.../%E0%B9%80%E0%B8%81%E0%B8%B4%E0%B8%94%E0%B9%83%E0%B8%AB%E0%B8%A1%E0%B9%88%E0%B8%81%E0%B9%87%E0%B9%84%E0%B8%94%E0%B9%89%E0%B8%AA%E0%B8%81%E0%B8%B4%E0%B8%A5%E0%B9%82%E0%B8%81%E0%B8%87%E0%B9%84%E0%B8%A7`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | ผมเจอเพื่อนสมัยเรียนที่ร้านลามก [MM] How I Met my Old Classmate at an Adult Service Place (`.../%E0%B8%9C%E0%B8%A1%E0%B9%80%E0%B8%88%E0%B8%AD%E0%B9%80%E0%B8%9E%E0%B8%B7%E0%B9%88%E0%B8%AD%E0%B8%99%E0%B8%AA%E0%B8%A1%E0%B8%B1%E0%B8%A2%E0%B9%80%E0%B8%A3%E0%B8%B5%E0%B8%A2%E0%B8%99%E0%B8%97%E0%B8%B5`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | สาวน้อยเวทมนตร์ ปะทะเหล่าปีศาจ [EsuEsu] Mahou Shoujo VS Inma Seibutsu (`.../%E0%B8%AA%E0%B8%B2%E0%B8%A7%E0%B8%99%E0%B9%89%E0%B8%AD%E0%B8%A2%E0%B9%80%E0%B8%A7%E0%B8%97%E0%B8%A1%E0%B8%99%E0%B8%95%E0%B8%A3%E0%B9%8C-%E0%B8%9B%E0%B8%B0%E0%B8%97%E0%B8%B0%E0%B9%80%E0%B8%AB%E0%B8%A5`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | บทเรียนในหน้าร้อน [Ebi Fry Teishoku] Natsu no Kojin Renshuu – A Private Lesson In The Summer (`.../%E0%B8%9A%E0%B8%97%E0%B9%80%E0%B8%A3%E0%B8%B5%E0%B8%A2%E0%B8%99%E0%B9%83%E0%B8%99%E0%B8%AB%E0%B8%99%E0%B9%89%E0%B8%B2%E0%B8%A3%E0%B9%89%E0%B8%AD%E0%B8%99-ebi-fry-teishoku-natsu-no-kojin-renshuu-a`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | เกิดใหม่ก็ได้สกิลโกงไว้เย็ดสาวในต่างโลก [Seisui BAR] Isekai Tensei Shite Nouryoku de H na Koto suru Hanashi (`.../%E0%B9%80%E0%B8%81%E0%B8%B4%E0%B8%94%E0%B9%83%E0%B8%AB%E0%B8%A1%E0%B9%88%E0%B8%81%E0%B9%87%E0%B9%84%E0%B8%94%E0%B9%89%E0%B8%AA%E0%B8%81%E0%B8%B4%E0%B8%A5%E0%B9%82%E0%B8%81%E0%B8%87%E0%B9%84%E0%B8%A7`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | เกิดใหม่ก็ได้สกิลโกงไว้เย็ดสาวในต่างโลก [Seisui BAR] Isekai Tensei Shite Nouryoku de H na Koto suru Hanashi (`.../%E0%B9%80%E0%B8%81%E0%B8%B4%E0%B8%94%E0%B9%83%E0%B8%AB%E0%B8%A1%E0%B9%88%E0%B8%81%E0%B9%87%E0%B9%84%E0%B8%94%E0%B9%89%E0%B8%AA%E0%B8%81%E0%B8%B4%E0%B8%A5%E0%B9%82%E0%B8%81%E0%B8%87%E0%B9%84%E0%B8%A7`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 28 | ตอนที่ 1 - เทพธิดา (`.../%E0%B9%80%E0%B8%81%E0%B8%B4%E0%B8%94%E0%B9%83%E0%B8%AB%E0%B8%A1%E0%B9%88%E0%B8%81%E0%B9%87%E0%B9%84%E0%B8%94%E0%B9%89%E0%B8%AA%E0%B8%81%E0%B8%B4%E0%B8%A5%E0%B9%82%E0%B8%81%E0%B8%87%E0%B9%84%E0%B8%A7`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 5 |  |  | 1-10s |

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
| details description | LINT | Description is empty; use null when unknown |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 28 chapters |  |  |  |
| chapter dates | LINT | All 28 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=28 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 5 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://doujinmoon.com/.../1-5.jpg` (image/jpeg, 877905 bytes, 1280x1789) |  |  |  |
