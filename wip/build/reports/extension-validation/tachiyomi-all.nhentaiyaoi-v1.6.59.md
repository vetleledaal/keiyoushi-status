# Extension Validation Report

- Extension: tachiyomi-all.nhentaiyaoi-v1.6.59
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
- Source theme: madara
- Source ID: 8357440793543203648
- Source name: nHentai Yaoi
- Source language: all
- Selected manga input: popular offset 0: Seishun Radio Station!!! Dai 72-kai! Taka Gakuen Taiiku Matsuri (`.../seishun-radio-station-dai-72-kai-taka-gakuen-taiiku-matsuri`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 16 | Seishun Radio Station!!! Dai 72-kai! Taka Gakuen Taiiku Matsuri (`.../seishun-radio-station-dai-72-kai-taka-gakuen-taiiku-matsuri`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 16 | BARTENOVERDOSE 〜 Gyaru Bātendā no Fudeoroshi ♡ 〜 (`.../bartenoverdose-%e3%80%9c-gyaru-batenda-no-fudeoroshi-%e2%99%a1-%e3%80%9c`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 16 | Tachi no Warui Yūjin (`.../tachi-no-warui-yujin`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 16 | Hoopu Senshi Wa Makenai -Haiboku IF- Hoopu Fureimu Kikai Zeme Hen (`.../hoopu-senshi-wa-makenai-haiboku-if-hoopu-fureimu-kikai-zeme-hen`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Seishun Radio Station!!! Dai 72-kai! Taka Gakuen Taiiku Matsuri (`.../seishun-radio-station-dai-72-kai-taka-gakuen-taiiku-matsuri`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Seishun Radio Station!!! Dai 72-kai! Taka Gakuen Taiiku Matsuri (`.../seishun-radio-station-dai-72-kai-taka-gakuen-taiiku-matsuri`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 68 |  |  | 1-10s |

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
| popular listing | PASS | 16 entries |  |  |  |
| latest listing | PASS | 16 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Seishun Radio Station!!! Dai 72-kai! Taka Gakuen Taiiku Matsuri, URL=`.../seishun-radio-station-dai-72-kai-taka-gakuen-taiiku-matsuri` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 65/65 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 65/65 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://nhentaiyaoi.com/.../seisyun03_001.webp` (image/webp (encoding: lossy), 297008 bytes, 1000x1411) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../seishun-radio-station-dai-72-kai-taka-gakuen-taiiku-matsuri` |  |  |  |
| details thumbnail URL | PASS | `https://nhentaiyaoi.com/.../seisyun03_001.webp` |  |  |  |
| details author | PASS | Takamiya |  |  |  |
| details artist | PASS | Takamiya |  |  |  |
| details genres | PASS | Doujinshi, Hentai, Anal, Blowjob, Creampie, Masturbation, Yaoi, 日本 |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Alternative Names: 青春ラジオステーション!!!第72回！飛鷹学園体育祭～掴みとれ！飛鷹魂！～ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 68 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://nhentaiyaoi.com/.../seisyun03_001.webp` (image/webp (encoding: lossy), 297008 bytes, 1000x1411) |  |  |  |
