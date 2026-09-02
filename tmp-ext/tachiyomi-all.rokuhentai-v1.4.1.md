# Extension Validation Report

- Extension: tachiyomi-all.rokuhentai-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 30
- Lint: 0
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6773816792833894188
- Source name: Roku Hentai
- Source language: all
- Selected manga input: popular offset 0: 🇰🇷 S:P 리틀나이트 (`.../lj2xek`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | 🇰🇷 S:P 리틀나이트 (`.../lj2xek`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 24 | 🇯🇵 今週の投稿 (`.../0a2ud0`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 24 | 🇰🇷 S:P 리틀나이트 (`.../lj2xek`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 🇰🇷 S:P 리틀나이트 (`.../lj2xek`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | 🇰🇷 S:P 리틀나이트 (`.../lj2xek`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 5 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=🇰🇷 S:P 리틀나이트, URL=`.../lj2xek` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 72/72 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 72/72 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://rokuhentai.com/.../lj2xek.jpg` (image/avif (format: avif), 14337 bytes, 229x320) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../lj2xek` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://rokuhentai.com/.../lj2xek.jpg` (image/webp (encoding: lossy), 52214 bytes, 458x640) |  |  |  |
| details author | PASS | p senpuki |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | kind: doujinshi, artist: "p senpuki", language: korean, parody: yu-gi-oh, character: "s p little knight", female: anal, female: "big ass", female: "big breasts", female: blowjob, female: "sole female" |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 5 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://rokuhentai.com/.../0.jpg` (image/webp (encoding: lossy), 149660 bytes, 900x1259) |  |  |  |
