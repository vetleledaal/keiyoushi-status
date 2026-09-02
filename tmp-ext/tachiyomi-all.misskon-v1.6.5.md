# Extension Validation Report

- Extension: tachiyomi-all.misskon-v1.6.5
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 492049561920540214
- Source name: MissKon
- Source language: all
- Selected manga input: popular offset 0: [AI Enhanced] Sehee (최세희): Tennis (118 photos) (`.../116238-ai-enhanced-sehee-choesehui-tennis-118-photos`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 15 | [AI Enhanced] Sehee (최세희): Tennis (118 photos) (`.../116238-ai-enhanced-sehee-choesehui-tennis-118-photos`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | [Bimilstory] Jindayul (진다율): Vol.07 Pantyhose with Open Part (151 photos) (`.../116904-bimilstory-jindayul-vol07-pantyhose-open-part-151-photos`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | [内购无水印] 鱼子酱Fish & 杏子Yada: 双人性感演绎 (125 photos) (`.../116845-nei-gou-wu-shui-yin-yu-zi-jiang-fish-xing-yada-shuang-ren-gan-yan-yi-125-photos`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | [AI Enhanced] Sehee (최세희): Tennis (118 photos) (`.../116238-ai-enhanced-sehee-choesehui-tennis-118-photos`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | [AI Enhanced] Sehee (최세희): Tennis (118 photos) (`.../116238-ai-enhanced-sehee-choesehui-tennis-118-photos`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3 | Page 1 (`.../1`) |  | <1s |
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
| popular listing | PASS | 15 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[AI Enhanced\] Sehee (최세희): Tennis (118 photos), URL=`.../116238-ai-enhanced-sehee-choesehui-tennis-118-photos` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 56/56 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 56/56 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://misskon.com/.../AI-Enhanced-Sehee-Choi-Tennis-MissKON.com-000.webp` (image/webp (container: extended), 33370 bytes, 600x315) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../116238-ai-enhanced-sehee-choesehui-tennis-118-photos` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | AI Enhanced, Sehee |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3 chapters |  |  |  |
| chapter dates | PASS | 3 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 12 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://tez.misskon.com/.../AI-Enhanced-Sehee-Choi-Tennis-MissKON.com-026.V567ULzr.webp` (image/webp (encoding: lossy), 118046 bytes, 1024x1360) |  |  |  |
