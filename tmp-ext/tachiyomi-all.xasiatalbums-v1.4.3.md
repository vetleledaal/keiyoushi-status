# Extension Validation Report

- Extension: tachiyomi-all.xasiatalbums-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7187893778775685546
- Source name: XAsiat Albums
- Source language: all
- Selected manga input: popular offset 0: [Photobook] 2025.06.03 乃木坂46 筒井あやめ 1st写真集 感情の隙間 (`.../photobook-2025-06-03-46-1st`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 12 | [Photobook] 2025.06.03 乃木坂46 筒井あやめ 1st写真集 感情の隙間 (`.../photobook-2025-06-03-46-1st`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 12 | Eunji Pyo in black lingerie (`.../eunji-in-black-lingerie2`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 12 | [NS Eyes] SF-061 - 2000.06.02 - Moemi Tominaga (冨永萌美) (`.../ns-eyes-sf-061-2000-06-02-moemi-tominaga`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 12 | [Photobook]【デジタル限定】豊島心桜写真集「世界ランクのゴージャスボディ」 (`.../photobook1300`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 12 | [Photobook] 2025.06.03 乃木坂46 筒井あやめ 1st写真集 感情の隙間 (`.../photobook-2025-06-03-46-1st`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | [Photobook] 2025.06.03 乃木坂46 筒井あやめ 1st写真集 感情の隙間 (`.../photobook-2025-06-03-46-1st`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Photobook (`.../photobook-2025-06-03-46-1st`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 169 |  |  | <1s |

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
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[Photobook\] 2025.06.03 乃木坂46 筒井あやめ 1st写真集 感情の隙間, URL=`.../photobook-2025-06-03-46-1st` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 60/60 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 60/60 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://pic.xascdn.li/.../preview.jpg` (image/jpeg, 12808 bytes, 380x507) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../photobook-2025-06-03-46-1st` |  |  |  |
| details thumbnail URL | PASS | `https://pic.xascdn.li/.../preview.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | JAV & AV Models, Photobook, Nogizaka46 |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | LINT | Description is empty; use null when unknown |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 169 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://www.xasiat.com/.../1949305.jpg <redacted query values: i-acctoken>` (image/jpeg, 747700 bytes, 1054x1490) |  |  |  |
