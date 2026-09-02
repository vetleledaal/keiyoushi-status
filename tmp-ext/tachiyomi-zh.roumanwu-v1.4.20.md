# Extension Validation Report

- Extension: tachiyomi-zh.roumanwu-v1.4.20
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 30
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3647420805839021718
- Source name: 肉漫屋
- Source language: zh
- Selected manga input: popular offset 0: 老師的親密指導 (`.../fca0100c-139e-4d1a-a997-2c257e8b3769`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 16 | 老師的親密指導 (`.../fca0100c-139e-4d1a-a997-2c257e8b3769`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 12 | 社死恋爱！（얼타는 로맨스!） (`.../cmspt0d5i001vs6hkx33dsxsp`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 18 | 老師的親密指導 (`.../fca0100c-139e-4d1a-a997-2c257e8b3769`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | 老師的親密指導 (`.../fca0100c-139e-4d1a-a997-2c257e8b3769`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 113 | 開始閱讀 (`.../0`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 110 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 16 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=老師的親密指導, URL=`.../fca0100c-139e-4d1a-a997-2c257e8b3769` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 46/46 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 46/46 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://towm85.xyz/.../czM6Ly9yb3VtYW4vaW1hZ2VzL2ZjYTAxMDBjLTEzOWUtNGQxYS1hOTk3LTJjMjU3ZThiMzc2OS9jb3Zlci5qcGc.jpg` (image/webp (encoding: lossy), 35408 bytes, 300x420; server Content-Type: bytes) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../fca0100c-139e-4d1a-a997-2c257e8b3769` |  |  |  |
| details thumbnail URL | PASS | `https://towm85.xyz/.../czM6Ly9yb3VtYW4vaW1hZ2VzL2ZjYTAxMDBjLTEzOWUtNGQxYS1hOTk3LTJjMjU3ZThiMzc2OS9jb3Zlci5qcGc.jpg` |  |  |  |
| details author | PASS | NOKO&雲河尹 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 韓國, 少婦, 老師, 家教, 私密關係, 調教, 校園, 暢銷作品 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 別名: 老师的亲密指导<br><br>為了把會長家的學渣兒子送進名門大學，換取10億獎金，家教老師們無所不用其極。「範辰…想知道老師內褲裡面…長什麼樣子嗎?♥」想擺爛?能敵過我的美人計再說! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 113 chapters |  |  |  |
| chapter dates | LINT | 112 of 113 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=112 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | FAIL | Duplicate chapter URLs: `.../0` at offsets 111, 112 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 110 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://v1.towm85.xyz/.../czM6Ly9yb3VtYW4vaW1hZ2VzL2ZjYTAxMDBjLTEzOWUtNGQxYS1hOTk3LTJjMjU3ZThiMzc2OS9mcmVleC8zOTU3Ny8xOTc2NjA5LmpwZw.jpg` (image/jpeg, 24124 bytes, 720x800; server Content-Type: bytes) |  |  |  |
