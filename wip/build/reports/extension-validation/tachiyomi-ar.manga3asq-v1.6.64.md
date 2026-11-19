# Extension Validation Report

- Extension: tachiyomi-ar.manga3asq-v1.6.64
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 33
- Lint: 0
- Warnings: 3
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 1073624495230267708
- Source name: مانجا العاشق
- Source language: ar
- Selected manga input: latest offset 0: One Piece (`.../1965`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 21 | One Piece (`.../1965`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 21 | Diamond no Ace Act II (`.../1999`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 21 | One Piece (`.../1965`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 21 | Haha to Iu Jubaku Musume to Iu Rougoku (`.../23678`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 7 | One Piece (French) (`.../13489`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | One Piece (`.../1965`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 573 | 0chapter - عالم قوي (`.../0chapter`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 23 |  |  | <1s |

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
| popular listing | PASS | 21 entries |  |  |  |
| latest listing | PASS | 21 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 5: title=One Piece, URL=`1965` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | FAIL | Invalid manga: popular_next entry 7: title=<blank>, URL=`16564` | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| thumbnail URLs | UNUSUAL | 89/91 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://3asq.online/.../v1-1-193x278.jpg` -> 3 manga URLs (examples: `13489`, `13394`, `1965`) |  |  |  |
| thumbnail | PASS | `https://3asq.online/.../v1-1-175x238.jpg` (image/jpeg, 27372 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `1965` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://3asq.online/.../v1-1.jpg.webp` (image/webp (container: extended), 661664 bytes, 1304x2048) |  |  |  |
| details author | PASS | Eiichiro Oda |  |  |  |
| details artist | PASS | Eiichiro Oda |  |  |  |
| details genres | PASS | 100%, 3asq, أكشن, خيال, دراما, قوى خارقة, كوميديا, مغامرة, فريق العاشق |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | تتمحور القصة حول مغامرات طاقم قراصنة قبعة القش بقيادة مونكي دي لوفي، لكل فرد من أفراد هذا الطاقم هدفٌ يطمح لتحقيقه، أما الهدف الرئيس لقائدهم لوفي هو إيجاد الكنز الأسطوري “ون بيس” وأن يغدو ملك القراصنة. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 573 chapters |  |  |  |
| chapter dates | PASS | 573 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 23 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://3asq.online/.../00.jpeg` (image/jpeg, 4923409 bytes, 2000x2979) |  |  |  |
