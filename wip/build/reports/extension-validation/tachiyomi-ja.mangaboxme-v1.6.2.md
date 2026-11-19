# Extension Validation Report

- Extension: tachiyomi-ja.mangaboxme-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1624494110013319952
- Source name: MangaBox
- Source language: ja
- Selected manga input: popular offset 0: 放課後インスタントXXX (`.../431495`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 3 | 放課後インスタントXXX (`.../431495`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 11 | 恋を諦めた妻が叶えたい100のこと (`.../640467`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 放課後インスタントXXX (`.../431495`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 放課後インスタントXXX (`.../431495`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 49 | 第1話 前編 (`.../171543`) |  | <1s |
| pages | `getPageList(chapter)` | success | 21 |  |  | 1-10s |

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
| popular listing | PASS | 3 entries |  |  |  |
| latest listing | PASS | 11 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=放課後インスタントXXX, URL=`431495` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 15/15 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 15/15 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://image-c.cdn.mangabox.me/.../manga_episode_grid_431495.png` (image/png, 671812 bytes, 744x792) |  |  |  |
| details identity | PASS | Details preserved selected URL `431495` |  |  |  |
| details thumbnail URL | PASS | `https://image-c.cdn.mangabox.me/.../manga_episode_grid_431495.png` |  |  |  |
| details author | PASS | 折月なおやす, 佐々木かず |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 青年, ラブストーリー, ちょっとHな男性マンガ, ラブコメ, 学園, ヒューマンドラマ, オリジナル |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 【更新：隔週月曜日】クラスで人気者の南川は放課後になると僕の部屋にやって来る。南川はすぐにショーツを脱ぎ、僕の上にまたがり身体を重ねる。快楽に素直に流される僕と彼女だけど──この関係って一体なんだろうか…。投稿サイトで2700万PV突破の青春譚、遂にコミカライズ！<br>※この物語はフィクションであり、実在の人物・団体・出来事などとは、一切関係ありません。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 49 chapters |  |  |  |
| chapter dates | PASS | 49 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 21 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://www.mangabox.me/.../image <redacted query values: d>` (image/jpeg, 122096 bytes, 800x1138) |  |  |  |
