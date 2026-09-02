# Extension Validation Report

- Extension: tachiyomi-tr.ruyamanga-v1.6.58
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5786550835901373927
- Source name: Rüya Manga
- Source language: tr
- Selected manga input: popular offset 0: Solo Leveling (`.../7394`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Solo Leveling (`.../7394`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Mutlak Büyücü (`.../6538`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Hükümdarlık Yolu (`.../8570`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | SSS-Class Gacha Hunter (`.../8522`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 4 | Solo Leveling: Ragnarok (`.../7612`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Solo Leveling (`.../7394`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 193 | Bölüm 0 (`.../bolum-0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 7 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=Solo Leveling, URL=`7394` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 104/104 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 104/104 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i2.wp.com/.../cover.webp <redacted query values: w, resize, and ssl>` (image/jpeg, 17009 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `7394` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i2.wp.com/.../cover.webp <redacted query values: w, resize, and ssl>` (image/jpeg, 21194 bytes, 193x278) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Aksiyon, Fantastik, Macera, Shounen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | E-rütbeli avcı Sung Jin-Woo, bir gün gizemli bir sistemle güçlenir. Zayıf olduğu dönemlerden sonra, bu sistem sayesinde giderek güçlenir ve dünyadaki en güçlü avcı olur.<br><br>Alternative Names: Solo Leveling, Ore dake level up na ken, Only i level up |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 193 chapters |  |  |  |
| chapter dates | PASS | 193 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 7 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn1.cdnformanga.xyz/.../06a76881e6374c2792fb5c5ee563a4c9_1.webp` (image/webp (encoding: lossy), 31574 bytes, 720x360) |  |  |  |
