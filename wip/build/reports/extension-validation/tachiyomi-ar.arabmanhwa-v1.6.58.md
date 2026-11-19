# Extension Validation Report

- Extension: tachiyomi-ar.arabmanhwa-v1.6.58
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
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
- Source ID: 5823096631874106406
- Source name: ArabManhwa
- Source language: ar
- Selected manga input: popular offset 0: صيد الميلف في عالم آخر (`.../%D8%B5%D9%8A%D8%AF-%D8%A7%D9%84%D9%85%D9%8A%D9%84%D9%81-%D9%81%D9%8A-%D8%B9%D8%A7%D9%84%D9%85-%D8%A2%D8%AE%D8%B1`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | صيد الميلف في عالم آخر (`.../%D8%B5%D9%8A%D8%AF-%D8%A7%D9%84%D9%85%D9%8A%D9%84%D9%81-%D9%81%D9%8A-%D8%B9%D8%A7%D9%84%D9%85-%D8%A2%D8%AE%D8%B1`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | Madam (`.../%D8%B3%D9%8A%D8%AF%D8%AA%D9%8A`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | Rented Room Brides (`.../rented-room-brides-1`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Dirty Talk (`.../dirty-talk`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | صيد الميلف في عالم آخر (`.../%D8%B5%D9%8A%D8%AF-%D8%A7%D9%84%D9%85%D9%8A%D9%84%D9%81-%D9%81%D9%8A-%D8%B9%D8%A7%D9%84%D9%85-%D8%A2%D8%AE%D8%B1-hentaislayer-3ef26b2f`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | صيد الميلف في عالم آخر (`.../%D8%B5%D9%8A%D8%AF-%D8%A7%D9%84%D9%85%D9%8A%D9%84%D9%81-%D9%81%D9%8A-%D8%B9%D8%A7%D9%84%D9%85-%D8%A2%D8%AE%D8%B1`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 143 | الفصل 01 (`.../%D8%A7%D9%84%D9%81%D8%B5%D9%84-01`) |  | <1s |
| pages | `getPageList(chapter)` | success | 27 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=صيد الميلف في عالم آخر, URL=`.../%D8%B5%D9%8A%D8%AF-%D8%A7%D9%84%D9%85%D9%8A%D9%84%D9%81-%D9%81%D9%8A-%D8%B9%D8%A7%D9%84%D9%85-%D8%A2%D8%AE%D8%B1` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 122/122 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 122/122 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.arabmanhwa.com/.../e08037c5a909-320.webp` (image/webp (encoding: lossy), 23848 bytes, 320x537) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../%D8%B5%D9%8A%D8%AF-%D8%A7%D9%84%D9%85%D9%8A%D9%84%D9%81-%D9%81%D9%8A-%D8%B9%D8%A7%D9%84%D9%85-%D8%A2%D8%AE%D8%B1` |  |  |  |
| details thumbnail URL | PASS | `https://img.arabmanhwa.com/.../e08037c5a909-320.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | جنس بالقدم, جنس شرجي, حريم, خيال, خيانة, ميلف |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | بعد أن تم القبض عليه أثناء مواجهة حميمة مع ميلف، هرب تاي يانغ إلى عالم آخر. عند دخوله إلى العالم الآخر وجد نفس في قلعة و يوجد هناك ميلف من الدرجة الأولى بجسم مذهل، هل سيتمكن تاي يانغ من صنع حريمه بأمان في هذا العالم؟ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 143 chapters |  |  |  |
| chapter dates | PASS | 143 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 27 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.arabmanhwa.com/.../001.jpg` (image/jpeg, 713652 bytes, 721x7415; server Content-Type: binary/octet-stream) |  |  |  |
