# Extension Validation Report

- Extension: tachiyomi-en.rokaricomics-v1.6.7
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 830150807344972132
- Source name: RokariComics
- Source language: en
- Selected manga input: popular offset 0: Peaceful Camping Life in Another World (`.../peaceful-camping-life-in-another-world`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Peaceful Camping Life in Another World (`.../peaceful-camping-life-in-another-world`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | The Youngest Daughter of the Great Magician of a Famous Swordsmanship Family (`.../the-youngest-daughter-of-the-great-magician-of-a-famous-swordsmanship-family`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | I Will Pay the Price for Deceiving You With My Life (`.../i-will-pay-the-price-for-deceiving-you-with-my-life`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Peaceful Camping Life in Another World (`.../peaceful-camping-life-in-another-world`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Peaceful Camping Life in Another World (`.../peaceful-camping-life-in-another-world`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 61 | Chapter 59 (`.../peaceful-camping-life-in-another-world-chapter-59`) |  | <1s |
| pages | `getPageList(chapter)` | success | 12 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Peaceful Camping Life in Another World, URL=`.../peaceful-camping-life-in-another-world` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 51/51 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 51/51 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://rokaricomics.com/.../kRxY3W-m-707x1024.jpg` (image/jpeg, 131445 bytes, 707x1024) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../peaceful-camping-life-in-another-world` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://rokaricomics.com/.../kRxY3W-m.jpg` (image/jpeg, 142967 bytes, 1024x1484) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Comedy, Fantasy, Isekai, Slice of life, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Star chef Ganghyeon Lee, who has lost his sense of taste, retreats to a peaceful countryside to escape the public eye. In his grandfather’s rural home, he stumbles upon a portal to another world. Taking advantage of his escape, he decides to enjoy a relaxed camping life in this new world. However, the inhabitants of this world keep showing interest in him. Will Ganghyeon be able to live a peaceful life?<br><br>Alternative Names: <br>- ตั้งแคมป์ฮีลใจในต่างโลก<br>- Acampando en otro Mundo: buscandole el sazon a la vida<br>- Healing Life Through Camping in Another World<br>- ตั้งแคมป์ฮีลใจในต่างโลก<br>- 異世界キャンプでのんびりライフ<br>- 異世界露營療癒生活<br>- 이세계 캠핑으로 힐링 라이프<br>- Acampando en otro Mundo: buscandole el sazon a la vida<br>- 이세계 캠핑으로 힐링 라이프<br>- Healing Life Through Camping In Another World<br>- 異世界露營療癒生活 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 61 chapters |  |  |  |
| chapter dates | PASS | 61 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 12 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://rokaricomics.com/.../01.jpg` (image/jpeg, 4984402 bytes, 800x12747) |  |  |  |
