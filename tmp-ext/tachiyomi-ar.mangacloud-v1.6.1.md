# Extension Validation Report

- Extension: tachiyomi-ar.mangacloud-v1.6.1
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 33
- Lint: 1
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1630897072449336068
- Source name: MangaCloud
- Source language: ar
- Selected manga input: popular offset 0: Spare Me, great lord! (`.../01LPkFkYfc4KkH5Wn3zB`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Spare Me, great lord! (`.../01LPkFkYfc4KkH5Wn3zB`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | I’ve Fallen for the Empire’s Greatest Villainess (`.../0ZpLdOqRFb35XnrQ4nzz`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | One Day, I Became a Hatchling (`.../DiZ5HzuwtzOpU8j3Nehe`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Spare Me, great lord! (`.../01LPkFkYfc4KkH5Wn3zB`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Spare Me, great lord! (`.../01LPkFkYfc4KkH5Wn3zB`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 822 | الفصل 1 (`.../1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 6 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Spare Me, great lord!, URL=`01LPkFkYfc4KkH5Wn3zB` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 61/61 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 61/61 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.mangacloud.online/.../f2f70cb739f009bb82327b907e25693c.jpg` (image/jpeg, 22679 bytes, 193x278) |  |  |  |
| details identity | PASS | Details preserved selected URL `01LPkFkYfc4KkH5Wn3zB` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.mangacloud.online/.../f2f70cb739f009bb82327b907e25693c.jpg` |  |  |  |
| details author | PASS | Updating |  |  |  |
| details artist | PASS | Updating |  |  |  |
| details genres | PASS | خيال, سحر, غموض, فنون قتاليه, كوميدى |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | بعد إحياء وعودة طاقة الروح ، بذل الرجال والنساء قصارى جهدهم لالتقاط كل خيوط من الطاقة الروحية والتدريب ، باستثناء Lu Shu ، مع نظام العاطفة السلبية الخاص به ، يصبح أقوى من خلال سخرية الآخرين! لقد أراد فقط حماية أخته الصغرى ، لكن تغيير حقبة لا مفر منه ، فكل ما يمكنه فعله هو … أن يسخر من الآخرين بشكل عابر ، ويصبح الأقوى! اذن هل انت جاهز هنا يأتي لو شو ، “ملك الشياطين العظيم” ~ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 822 chapters |  |  |  |
| chapter dates | LINT | All 822 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=822 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 6 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.mangacloud.online/.../fc69e770af0a09dbe6c649fb2bd8d465.jpg` (image/jpeg, 2760493 bytes, 1320x25800) |  |  |  |
