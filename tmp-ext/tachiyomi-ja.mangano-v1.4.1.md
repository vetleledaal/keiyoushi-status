# Extension Validation Report

- Extension: tachiyomi-ja.mangano-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: 81336186c4ddb47e2a35eeb9ae58ceb10e8dc995
- Passed: 34
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7717838940254847800
- Source name: MangaNo
- Source language: ja
- Selected manga input: popular offset 0: 神南兄妹の苦難 (`.../104c0e41e9926ac6822`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 100 | 神南兄妹の苦難 (`.../104c0e41e9926ac6822`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 100 | 七塚妖怪奇譚 (`.../104d2bc58e4b6e96958`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 100 | 【ホラー】闇派遣会社レンタルBODY (`.../104d3914be4b6e96958`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 神南兄妹の苦難 (`.../104c0e41e9926ac6822`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 神南兄妹の苦難 (`.../104c0e41e9926ac6822`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 13 | 1話 (`.../105cde41e9926ac6822`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 40 |  |  | 1-10s |

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
| popular listing | PASS | 100 entries |  |  |  |
| latest listing | PASS | 100 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=神南兄妹の苦難, URL=`104c0e41e9926ac6822` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 301/301 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 301/301 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.manga-no.com/.../db98d371-3fbf-4c2c-8a70-09f9ad20a16d` (image/jpeg, 402577 bytes, 1200x675) |  |  |  |
| details identity | PASS | Details preserved selected URL `104c0e41e9926ac6822` |  |  |  |
| details thumbnail URL | PASS | `https://img.manga-no.com/.../db98d371-3fbf-4c2c-8a70-09f9ad20a16d` |  |  |  |
| details author | PASS | 鶴亀まよ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 学園, ラブコメ, 恋愛, ヒューマンドラマ, 縦読み, カラー |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ひょんなことから身体が入れ替わってしまった双子の兄妹、旺李と姫李。元に戻るにはこの身体でお互いの恋を叶える必要があるらしく――!?（11話以降は最新2話のみ無料公開となります） |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 13 chapters |  |  |  |
| chapter dates | PASS | 13 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 40 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img.manga-no.com/.../7b4d254e-afbc-4b6b-9782-c9e4efe61770` (image/jpeg, 279323 bytes, 800x3558) |  |  |  |
