# Extension Validation Report

- Extension: tachiyomi-all.kiutaku-v1.4.6
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3040035304874076216
- Source name: Kiutaku
- Source language: all
- Selected manga input: latest offset 0: Yoshinobi - Kinako School Swimsuit - Mitaku (`.../7289`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Bishoujo Mom - Sam Manson - Mitaku (`.../6647`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Hidori Rose - Maki Zenin - Mitaku (`.../7244`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Yoshinobi - Kinako School Swimsuit - Mitaku (`.../7289`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Umeko J - Yumeko Jabami - Mitaku (`.../7270`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Yoshinobi - Kinako School Swimsuit - Mitaku (`.../7289`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Yoshinobi - Kinako School Swimsuit - Mitaku (`.../7289`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Page 1 (`.../7289`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 18 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Yoshinobi - Kinako School Swimsuit - Mitaku, URL=`.../7289` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mitaku.net/.../Yoshinobi-Kinako-School-Swimsuit-Cover.jpg` (image/jpeg, 196979 bytes, 800x356) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../7289` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Yoshinobi, Kinako, My Cat is a Kawaii Girl |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 18 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://mitaku.net/.../Yoshinobi-Kinako-School-Swimsuit-1.jpg` (image/jpeg, 205084 bytes, 576x1024) |  |  |  |
