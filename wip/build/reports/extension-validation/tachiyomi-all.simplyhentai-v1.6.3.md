# Extension Validation Report

- Extension: tachiyomi-all.simplyhentai-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 298934354390867671
- Source name: Simply Hentai
- Source language: en
- Selected manga input: popular offset 0: The Fallen Angel's Job @ Rookie Angel "Treira" (`.../the-fallen-angels-job-rookie-angel-treira`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | The Fallen Angel's Job @ Rookie Angel "Treira" (`.../the-fallen-angels-job-rookie-angel-treira`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | [DaimongG] S-Class Hero, Pregnant with a Monster's Child (English) (MTL) (`.../daimongg-s-class-hero-pregnant-with-a-monsters-child-english-mtl`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Velamma Dreams - Chapter 11 (`.../velamma-dreams-chapter-11`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Per Request - Reika Yotsui (`.../per-request-reika-yotsui`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Fallen Angel's Job @ Rookie Angel "Treira" (`.../the-fallen-angels-job-rookie-angel-treira`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Fallen Angel's Job @ Rookie Angel "Treira" (`.../the-fallen-angels-job-rookie-angel-treira`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../all-pages`) |  | <1s |
| pages | `getPageList(chapter)` | success | 62 |  |  | <1s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Fallen Angel's Job @ Rookie Angel "Treira", URL=`.../the-fallen-angels-job-rookie-angel-treira` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://images.sh-cdn.com/.../thumb_7a00c512.webp` (image/webp (encoding: lossy), 40686 bytes, 480x685) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-fallen-angels-job-rookie-angel-treira` |  |  |  |
| details thumbnail URL | PASS | `https://images.sh-cdn.com/.../thumb_7a00c512.webp` |  |  |  |
| details author | PASS | jyantaku |  |  |  |
| details artist | PASS | jyantaku |  |  |  |
| details genres | PASS | Angel, big breasts, Blowjob, cunnilingus, full color, halo, Kissing, mosaic censorship, Nakadashi, rough translation, sole female, sole male, wings |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | **Series:** Original Work |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 62 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://images.sh-cdn.com/.../7a00c512.webp` (image/webp (encoding: lossy), 58750 bytes, 560x420) |  |  |  |
