# Extension Validation Report

- Extension: tachiyomi-all.beauty3600000-v1.4.6
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 8
- Lint: 0
- Warnings: 1
- Skipped: 23
- Failed: 4
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5498091984644576825
- Source name: 3600000 Beauty
- Source language: all
- Selected manga input: popular offset 0: Amau Kisumi 天羽希純 – 漫画アクションデジタル写真集 「恋のおわり」 (`.../89485`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 100 | Amau Kisumi 天羽希純 – 漫画アクションデジタル写真集 「恋のおわり」 (`.../89485`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 0 |  |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `fetchMangaDetails(manga)` | error | 0 |  | kotlinx.serialization.json.JsonDecodingException: Expected start of the object '{', but had 'EOF' instead at path: \$<br>JSON input:  | 1-10s |
| chapters | `fetchChapterList(manga)` | error | 0 |  | kotlinx.serialization.json.JsonDecodingException: Expected start of the object '{', but had 'EOF' instead at path: \$<br>JSON input:  | 1-10s |
| pages | `fetchPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | ERROR | kotlinx.serialization.json.JsonDecodingException: Expected start of the object '{', but had 'EOF' instead at path: \$<br>JSON input:  | REVIEW | INSUFFICIENT_EVIDENCE |  |
| chapters operation | ERROR | kotlinx.serialization.json.JsonDecodingException: Expected start of the object '{', but had 'EOF' instead at path: \$<br>JSON input:  | REVIEW | INSUFFICIENT_EVIDENCE |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 100 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | FAIL | Page 2 is empty despite page 1 advertising a next page | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 100/100 popular manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 100/100 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://reiobox.top/.../GRA08V135_1.webp` -> 3 manga URLs (examples: `89485`, `89529`, `89651`), `https://reiobox.top/.../GRA08V131_1.webp` -> 2 manga URLs (examples: `89566`, `89483`), `https://wakobox.top/.../GRA08R131_1.webp` -> 2 manga URLs (examples: `89482`, `89565`), `https://reiobox.top/.../COS08P125_1.webp` -> 2 manga URLs (examples: `89439`, `89645`), `https://wakobox.top/.../GRA08R115_1.webp` -> 3 manga URLs (examples: `89388`, `89648`, `89481`), `https://wakobox.top/.../GRA08V117_1.webp` -> 2 manga URLs (examples: `89478`, `89386`), `https://wakobox.top/.../GRA08V115_1.webp` -> 2 manga URLs (examples: `89480`, `89387`), `https://karubox.top/.../TBA08A102_1.webp` -> 2 manga URLs (examples: `89637`, `89433`), `https://karubox.top/.../REN08M101_1.webp` -> 2 manga URLs (examples: `89722`, `89602`), `https://karubox.top/.../REN08M106_1.webp` -> 2 manga URLs (examples: `89721`, `89603`), `https://wakobox.top/.../GRA08V094_1.webp` -> 2 manga URLs (examples: `89436`, `89641`), `https://wakobox.top/.../GRA08Z092_1.webp` -> 2 manga URLs (examples: `89324`, `89639`), `https://wakobox.top/.../GRA08V095_1.webp` -> 2 manga URLs (examples: `89638`, `89323`), `https://wakobox.top/.../GRA08V096_1.webp` -> 3 manga URLs (examples: `89326`, `89562`, `89435`), `https://wakobox.top/.../GRA08V091_1.webp` -> 2 manga URLs (examples: `89325`, `89434`), `https://wakobox.top/.../GRA08Z091_1.webp` -> 2 manga URLs (examples: `89643`, `89327`), `https://wakobox.top/.../GRA08Z094_1.webp` -> 2 manga URLs (examples: `89563`, `89640`), `https://harubox.top/.../KOR08D043_1.webp` -> 2 manga URLs (examples: `89670`, `89381`), `https://harubox.top/.../KOR08D033_1.webp` -> 3 manga URLs (examples: `89473`, `89714`, `89379`), `https://harubox.top/.../KOR08D087_1.webp` -> 2 manga URLs (examples: `89474`, `89716`), `https://harubox.top/.../KOR08B081_1.webp` -> 2 manga URLs (examples: `89559`, `89382`), `https://harubox.top/.../KOR08D035_1.webp` -> 2 manga URLs (examples: `89380`, `89557`), `https://harubox.top/.../KOR08D084_1.webp` -> 3 manga URLs (examples: `89520`, `89378`, `89697`), `https://harubox.top/.../KOR08D082_1.webp` -> 2 manga URLs (examples: `89669`, `89377`), `https://harubox.top/.../KOR08D089_1.webp` -> 3 manga URLs (examples: `89713`, `89472`, `89696`), `https://harubox.top/.../KOR08D085_1.webp` -> 2 manga URLs (examples: `89715`, `89475`) |  |  |  |
| thumbnail | PASS | `https://reiobox.top/.../GRA08V135_1.webp` (image/webp (encoding: lossy), 249554 bytes, 1200x1800) |  |  |  |
| details identity | SKIP | No details manga URL to compare |  |  |  |
| details thumbnail URL | SKIP | No details manga to check |  |  |  |
| details author | SKIP | No details manga to check |  |  |  |
| details artist | SKIP | No details manga to check |  |  |  |
| details genres | SKIP | No details manga to check |  |  |  |
| details status | SKIP | No details manga to check |  |  |  |
| details description | SKIP | No details manga to check |  |  |  |
| metadata trimming | SKIP | No details metadata to check |  |  |  |
| chapters | SKIP | Chapters did not run successfully |  |  |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
