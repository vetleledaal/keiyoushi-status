# Extension Validation Report

- Extension: tachiyomi-all.everiaclub-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 34
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7698513740234984368
- Source name: Everia.club
- Source language: all
- Selected manga input: popular offset 0: Taeri 태리 – Bimilstory Vol.42 「Summer Swimming Pool」 (`.../taeri-%ED%83%9C%EB%A6%AC-bimilstory-vol-42-%E3%80%8Csummer-swimming-pool%E3%80%8D`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 8 | Taeri 태리 – Bimilstory Vol.42 「Summer Swimming Pool」 (`.../taeri-%ED%83%9C%EB%A6%AC-bimilstory-vol-42-%E3%80%8Csummer-swimming-pool%E3%80%8D`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Garum – PhotoBook 「Milk Cow In The Pink House」 (`.../garum-photobook-%E3%80%8Cmilk-cow-in-the-pink-house%E3%80%8D`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Enako えなこ – 漫画アクションデジタル写真集 「揺らぐ心に甘い蜜」 (`.../enako-%E3%81%88%E3%81%AA%E3%81%93-%E6%BC%AB%E7%94%BB%E3%82%A2%E3%82%AF%E3%82%B7%E3%83%A7%E3%83%B3%E3%83%87%E3%82%B8%E3%82%BF%E3%83%AB%E5%86%99%E7%9C%9F%E9%9B%86-%E3%80%8C%E6%8F%BA%E3%82%89%E3%81%90`) |  | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 10s+ |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Taeri 태리 – Bimilstory Vol.42 「Summer Swimming Pool」 (`.../taeri-%ED%83%9C%EB%A6%AC-bimilstory-vol-42-%E3%80%8Csummer-swimming-pool%E3%80%8D`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Gallery (`.../taeri-%ED%83%9C%EB%A6%AC-bimilstory-vol-42-%E3%80%8Csummer-swimming-pool%E3%80%8D`) |  | <1s |
| pages | `getPageList(chapter)` | success | 112 |  |  | 10s+ |

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
| popular listing | PASS | 8 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 48/48 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 48/48 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://reiobox.top/.../KOR09D183_0.webp` (image/webp (encoding: lossy), 22142 bytes, 400x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../taeri-%ED%83%9C%EB%A6%AC-bimilstory-vol-42-%E3%80%8Csummer-swimming-pool%E3%80%8D` |  |  |  |
| details thumbnail URL | PASS | `https://reiobox.top/.../KOR09D183_0.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Bimilstory, Taeri 태리 |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Taeri 태리 – Bimilstory Vol.42 「Summer Swimming Pool」 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 112 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://reiobox.top/.../KOR09D183_1.webp` (image/webp (encoding: lossy), 173246 bytes, 1142x1500) |  |  |  |
