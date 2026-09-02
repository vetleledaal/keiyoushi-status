# Extension Validation Report

- Extension: tachiyomi-vi.nettruyens-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6085559443545258070
- Source name: NetTruyenS (unoriginal)
- Source language: vi
- Selected manga input: latest offset 0: Uma Musume: Pretty Derby - Star Blossom (`.../uma-musume-pretty-derby-star-blossom`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 36 | Võ Luyện Đỉnh Phong (`.../vo-luyen-dinh-phong`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 36 | Uma Musume: Pretty Derby - Star Blossom (`.../uma-musume-pretty-derby-star-blossom`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Uma Musume: Pretty Derby - Star Blossom (`.../uma-musume-pretty-derby-star-blossom`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Uma Musume: Pretty Derby - Star Blossom (`.../uma-musume-pretty-derby-star-blossom`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 72 | Chapter 1 (`.../chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 70 |  |  | 1-10s |

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
| popular listing | PASS | 36 entries |  |  |  |
| latest listing | PASS | 36 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Uma Musume: Pretty Derby - Star Blossom, URL=`.../uma-musume-pretty-derby-star-blossom` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 73/73 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 73/73 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://st.netcdn.one/.../uma-musume-pretty-derby-star-blossom.jpg <redacted query values: 1756537102>` (image/jpeg, 86118 bytes, 360x512) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../uma-musume-pretty-derby-star-blossom` |  |  |  |
| details thumbnail URL | PASS | `https://st.netcdn.one/.../uma-musume-pretty-derby-star-blossom.jpg <redacted query values: 1756537102>` |  |  |  |
| details author | PASS | Hotani Shin - Monjūsaki - Cygames |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Manga, School Life, Slice Of Life, Sports |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Một đầu truyện spinoff của Uma Musume Pretty Derby với nhân vật chính là "Sakura Laurel."<br><br>Tên khác: ウマ娘 プリティーダービー スターブロッサム |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 72 chapters |  |  |  |
| chapter dates | PASS | 72 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 70 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://i2.netcdn.one/.../0000.webp <redacted query values: t>` (image/webp (encoding: lossy), 458020 bytes, 822x2927) |  |  |  |
