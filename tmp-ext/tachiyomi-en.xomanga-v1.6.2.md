# Extension Validation Report

- Extension: tachiyomi-en.xomanga-v1.6.2
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 26
- Lint: 0
- Warnings: 0
- Skipped: 8
- Failed: 2
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4986437736966387160
- Source name: XoManga
- Source language: en
- Selected manga input: latest offset 0: Ataerareta Skill wo Tsukatte Kasei de Isekai Bijotachi to Ichaicha shitai (`.../ataerareta-skill-wo-tsukatte-kasei-de-isekai-bijotachi-to-ichaicha-shitai`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 15 | Ataerareta Skill wo Tsukatte Kasei de Isekai Bijotachi to Ichaicha shitai (`.../ataerareta-skill-wo-tsukatte-kasei-de-isekai-bijotachi-to-ichaicha-shitai`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 46 | Ataerareta Skill wo Tsukatte Kasei de Isekai Bijotachi to Ichaicha shitai (`.../ataerareta-skill-wo-tsukatte-kasei-de-isekai-bijotachi-to-ichaicha-shitai`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Ataerareta Skill wo Tsukatte Kasei de Isekai Bijotachi to Ichaicha shitai (`.../ataerareta-skill-wo-tsukatte-kasei-de-isekai-bijotachi-to-ichaicha-shitai`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 100 | Chapter 1 (`.../ataerareta-skill-wo-tsukatte-kasei-de-isekai-bijotachi-to-ichaicha-shitai`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | kotlinx.serialization.MissingFieldException: Field 'images' is required for type with serial name 'eu.kanade.tachiyomi.extension.en.xomanga.ImageResponse', but it was missing | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | kotlinx.serialization.MissingFieldException: Field 'images' is required for type with serial name 'eu.kanade.tachiyomi.extension.en.xomanga.ImageResponse', but it was missing | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 15 entries |  |  |  |
| latest listing | PASS | 46 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 61/61 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 61/61 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://pub-687b4857923449468676585d29183982.r2.dev/.../ataerareta-skill-wo-tsukatte-kasei-de-isekai-bijotachi-to-ichaicha-shitai_cover_fixed.jpg` (image/jpeg, 746681 bytes, 1500x2133) |  |  |  |
| details identity | PASS | Details preserved selected URL `ataerareta-skill-wo-tsukatte-kasei-de-isekai-bijotachi-to-ichaicha-shitai` |  |  |  |
| details thumbnail URL | PASS | `https://pub-687b4857923449468676585d29183982.r2.dev/.../ataerareta-skill-wo-tsukatte-kasei-de-isekai-bijotachi-to-ichaicha-shitai_cover_fixed.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Demons, Romance, Adventure, Magic, Harem, Isekai, Fantasy, Vampires, Monster Girls, Slice of Life, Adaptation |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | That day, Ishida Yamada was working his part-time job as usual. After finishing his shift, he opened the back door and stepped into a vast, empty space, where he encountered a mysterious figure claiming to be God. By sheer chance, Ishida was chosen by this God to be transported to another world. Although confused and uncertain, he resolved to adapt and make a life for himself in this strange new place. Using the skills granted by God, he focused on surviving and thriving. As he explored different lands and encountered various races, he made it his mission to form close relationships with many beautiful women along the way. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 100 chapters |  |  |  |
| chapter dates | PASS | 100 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Field 'images' is required for type with serial name 'eu.kanade.tachiyomi.extension.en.xomanga.ImageResponse', but it was missing |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
