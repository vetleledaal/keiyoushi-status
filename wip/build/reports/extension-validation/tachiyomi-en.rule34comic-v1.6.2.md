# Extension Validation Report

- Extension: tachiyomi-en.rule34comic-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5276184613570933378
- Source name: Rule34Comic
- Source language: en
- Selected manga input: popular offset 0: [MarmaladeMum] Berry Cakes: Dirty Little Secret (Comic) (`.../marmalademum-berry-cakes-dirty-little-secret-comic`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | [MarmaladeMum] Berry Cakes: Dirty Little Secret (Comic) (`.../marmalademum-berry-cakes-dirty-little-secret-comic`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | Ben x Gwen (`.../ben-x-gwen`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | [Lazei] Galacta Sniffing the Marvel Girl's Farts (`.../lazei-galacta-sniffing-the-marvel-girl-s-farts2`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | [Chihel] 네토라세 아내 [Korean, English] (`.../chihel-korean-english`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 24 | [MarmaladeMum] Berry Cakes: Dirty Little Secret (Comic) (`.../marmalademum-berry-cakes-dirty-little-secret-comic`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | [MarmaladeMum] Berry Cakes: Dirty Little Secret (Comic) (`.../marmalademum-berry-cakes-dirty-little-secret-comic`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../marmalademum-berry-cakes-dirty-little-secret-comic`) |  | <1s |
| pages | `getPageList(chapter)` | success | 32 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[MarmaladeMum\] Berry Cakes: Dirty Little Secret (Comic), URL=`.../marmalademum-berry-cakes-dirty-little-secret-comic` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 120/120 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 120/120 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://us-image-01.rule34comic.party/.../preview.jpg` (image/jpeg, 12991 bytes, 240x320) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../marmalademum-berry-cakes-dirty-little-secret-comic` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://eu-image-01.rule34comic.party/.../preview.jpg` (image/jpeg, 12991 bytes, 240x320) |  |  |  |
| details author | PASS | marmalade mum |  |  |  |
| details artist | PASS | marmalade mum |  |  |  |
| details genres | PASS | english, strawberry shortcake, big penis, condom, sole male, anal, anal intercourse, big ass, blowjob, cheating, deepthroat, focus anal, freckles, hotpants, makeup, nakadashi, prostitution, sole female, stockings, x-ray, comic, full color, straight |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | 32 pages · **Categories:** strawberry shortcake |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 32 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://rule34comic.party/.../94413.jpg <redacted query values: i-acctoken>` to `https://eu-image-01.rule34comic.party/.../remote_control.php <redacted query values: file and acctoken>` (1 redirects) |  |  |  |
| page load | PASS | `https://rule34comic.party/.../94413.jpg <redacted query values: i-acctoken>` (image/jpeg, 159465 bytes, 1280x1920) |  |  |  |
