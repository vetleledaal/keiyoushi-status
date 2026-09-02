# Extension Validation Report

- Extension: tachiyomi-ja.jumprookie-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 33
- Lint: 2
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4194563020378281165
- Source name: Jump Rookie!
- Source language: ja
- Selected manga input: latest offset 0: KISS in the DARK (`.../pGBIkZlSrWI`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 16 | ミミックです。 (`.../OmkvmYUhCk4`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 16 | 名前のない幸せ (`.../TWpXKpYSE34`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | KISS in the DARK (`.../pGBIkZlSrWI`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | ROAR (`.../TWpXKpYkF_U`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | KISS in the DARK (`.../pGBIkZlSrWI`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | KISS in the DARK (`.../pGBIkZlSrWI`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 11 | 第 1 話 (`.../pGBIkZlSrWQ`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 15 |  |  | 1-10s |

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
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=KISS in the DARK, URL=`.../pGBIkZlSrWI` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 73/73 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 73/73 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-scissors.gigaviewer.com/.../https%3A%2F%2Fcdn-img.rookie.shonenjump.com%2Fpublic%2Fcover_images%2F11844546810164194592-a176b7736ad5` (image/jpeg, 26773 bytes, 320x320) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../pGBIkZlSrWI` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-img.rookie.shonenjump.com/.../11844546810164194592-a176b7736ad5` (image/jpeg, 63811 bytes, 640x640) |  |  |  |
| details author | PASS | 紅丸 作 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | その他 |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 新米ホステスの千景は『運命の人』との出逢いを夢見ていた。 深夜の繁華街で半グレに襲われてしまった千景の窮地を救ったのは絵に描いたようなTHEヤクザの大輔だった…。千景の運命の人は果たして大輔なのか？ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 11 chapters |  |  |  |
| chapter dates | LINT | All 11 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=11 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 15 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn-img.rookie.shonenjump.com/.../11844546810164194574-4f326e8c5f4e` (image/jpeg, 275681 bytes, 1200x1691) |  |  |  |
