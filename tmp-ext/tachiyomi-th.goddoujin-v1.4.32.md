# Extension Validation Report

- Extension: tachiyomi-th.goddoujin-v1.4.32
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 3638625079908519060
- Source name: God-Doujin
- Source language: th
- Selected manga input: latest offset 0: My Wife is a Magical Girl (`.../my-wife-is-a-magical-girl`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | MILF Hunting In Another World (`.../milf-hunting-in-another-world`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 10 | I Have To Sleep With A Stranger? (`.../i-have-to-sleep-with-a-stranger`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 10 | My Wife is a Magical Girl (`.../my-wife-is-a-magical-girl`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 10 | Rooftop Sex King (`.../rooftop-sex-king`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | My Wife is a Magical Girl (`.../my-wife-is-a-magical-girl`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | My Wife is a Magical Girl (`.../my-wife-is-a-magical-girl`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 23 | ตอนที่ 1 (`.../my-wife-is-a-magical-girl-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 15 |  |  | 1-10s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=My Wife is a Magical Girl, URL=`.../my-wife-is-a-magical-girl` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://god-doujin.com/.../MyWifeIsAMagicalGirl-Cover-God-211x300.jpg` (image/jpeg, 27590 bytes, 211x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../my-wife-is-a-magical-girl` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://god-doujin.com/.../MyWifeIsAMagicalGirl-Cover-God.jpg` (image/jpeg, 245261 bytes, 422x600) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Exclusive, นมใหญ่, ภาพสี, มังฮวา 18+, หนวด, แฟนตาซี, โรแมนติก, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | มันฮวา \| My Wife is a Magical Girl อ่านมันฮวา \| My Wife is a Magical Girl Manhwa แปลไทย \| My Wife is a Magical Girl ภรรยาผู้อ่อนหวาน และใช้ชีวิตอย่างเรียบง่าย แท้จริงแล้วคือ “สาวน้อยเวทมนตร์” ที่คอยกำจัดเหล่าร้าย!? อ่าน My Wife is a Magical Girl แปลไทย |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 23 chapters |  |  |  |
| chapter dates | PASS | 23 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 15 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://server1.webtoon168.com/.../6oWhlBOZOJREXwNufbBaZE.jpeg` (image/jpeg, 4440219 bytes, 720x15000) |  |  |  |
