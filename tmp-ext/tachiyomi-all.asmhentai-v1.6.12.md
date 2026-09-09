# Extension Validation Report

- Extension: tachiyomi-all.asmhentai-v1.6.12
- Input artifact: JAR
- Generated at: 2026-09-09T18:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source theme: galleryadults
- Source ID: 6135783261825346877
- Source name: AsmHentai
- Source language: en
- Selected manga input: popular offset 0: [Takatsu] Ou-sama Appli - King App [English] (`.../165159`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | [Takatsu] Ou-sama Appli - King App [English] (`.../165159`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | [Otochichi] Gamandekinai Mesuana [English] [desudesu, LWB, Brolen] (`.../199298`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | [Botamochi] Masaka Ano Oni Joushi ga Ore no SeFri ni Naru nante... 4 ~ Oni Joushi to Kokoro to Karada Kasaneru Jun'ai Kekkon Shoya | I never thought that diabolical boss would become my sex friend 4 [English] [MTL] (`.../680458`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | [Bitch Goigostar] Ero BBA ♥ Dosukebe Ha Sengen [Digital] (`.../680323`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | [Takatsu] Ou-sama Appli - King App [English] [TheRobotsGhost] [AI colored] (`.../493025`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | [Takatsu] Ou-sama Appli - King App [English] (`.../165159`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../165159`) |  | <1s |
| pages | `getPageList(chapter)` | success | 203 |  |  | <1s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=\[Takatsu\] Ou-sama Appli - King App \[English\], URL=`.../165159` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 82/82 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 82/82 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://images.asmhentai.com/.../thumb.jpg` (image/jpeg, 23747 bytes, 250x344) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../165159` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://images.asmhentai.com/.../cover.jpg` (image/jpeg, 40860 bytes, 350x482) |  |  |  |
| details author | PASS | takatsu |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | ahegao, big breasts, bikini, blackmail, blowjob, body writing, bride, defloration, double penetration, exhibitionism, ffm threesome, filming, garter belt, glasses, group, humiliation, impregnation, incest, lolicon, long tongue, milf, mind control, mmf threesome, mother, nakadashi, netorare, oyakodon, pantyhose, rape, schoolboy uniform, schoolgirl uniform, shotacon, small breasts, stockings, story arc, swimsuit, tankoubon, tanlines, teacher, tracksuit |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | **Languages**: english, translated<br><br>**Category**: manga<br><br>**Pages**: 203<br><br>**Alternative title**: \[高津\] 王様アプリ \[英訳\] |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 203 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://images.asmhentai.com/.../1.jpg` (image/jpeg, 221558 bytes, 1280x1761) |  |  |  |
