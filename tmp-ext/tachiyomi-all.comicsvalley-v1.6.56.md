# Extension Validation Report

- Extension: tachiyomi-all.comicsvalley-v1.6.56
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1103204227230640533
- Source name: Comics Valley
- Source language: all
- Selected manga input: latest offset 0: Nisego Mirko And The Quirk of Love! (My Hero Academia) (`.../171119`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Velamma Hindi Episodes (`.../3921`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Kirtu XXX Apartments (`.../2617`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Nisego Mirko And The Quirk of Love! (My Hero Academia) (`.../171119`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Tracy Scops That Night In 66 (Spider-Man) (`.../171834`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Nisego Mirko And The Quirk of Love! (My Hero Academia) (`.../171119`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Nisego Mirko And The Quirk of Love! (My Hero Academia) (`.../171119`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Mirko And The Quirk of Love! 1 - (My Hero Academia) [Nisego] (`.../mirko-and-the-quirk-of-love-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 31 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Nisego Mirko And The Quirk of Love! (My Hero Academia), URL=`171119` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://comicsvalley.com/.../Mirko-And-The-Quirk-of-Love-My-Hero-Academia-Nisego-350x476.jpg` (image/jpeg, 32579 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `171119` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://comicsvalley.com/.../Mirko-And-The-Quirk-of-Love-My-Hero-Academia-Nisego-193x278.jpg` (image/jpeg, 13214 bytes, 193x278) |  |  |  |
| details author | PASS | Nisego |  |  |  |
| details artist | PASS | Mirio Togata, Rumi Usagiyama |  |  |  |
| details genres | PASS | Anime, Big Breasts, Big Penis, Bunny Girl, Dark Skin, Kemonomimi, Muscle, Sole Female, Sole Male, Superhero, Superheroine, Tights, Western |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Nisego Mirko And The Quirk of Love! (My Hero Academia) Read Online Download Free English Full Western Comics With Direct Download Links And Read Online With High Quality Images.<br><br>This Is A Very Interesting And Sexy Comic Episode. This Is An Adult And Romantic Comic Book Issue. The Crater of This Comics Maximum Illustrate The Situations of Romantic Scenes. Nisego Is The Publisher of This Comic Book Episode. This Western Comic Book Characters Are Very Romantic. Most Impotent Thing In This Comic Issue Is They Have Deigned Very Beautiful Art Work’s of The Cartoon Characters. This Comic Book Provided In English Language With Easy Readable Words.<br><br>Click On Below Provided Link of Nisego Mirko And The Quirk of Love! (My Hero Academia) Read Online With High Quality. We Are Providing Complete Comic Book of This Episode. Just Click And Read Online. We Have Provided Direct Readable Option In Online Web Page of This Comic Issue. You Can Read This Comic Issue / Episode In Online With Easy Navigation’s And Zooming Options. If You Would Like To Read This Type of Porn Western Comics You Can Read In Our Web Site.<br><br>Click On Below Link of Nisego Mirko And The Quirk of Love! (My Hero Academia) Free Download. For This Comic Book We Are Providing Easy Download Link And To Download This Comic Issue Don’t Required Any Kind of Passwords No Need To Do Surveys And No Waiting Time. You Can Download All Comics With Maximum Speed of Your Internet. If You Would Like to Download All Latest Comics From This Comic Author Nisego Comics We Have Provided All Porn Comics of This Author In Our Web Site.<br><br>Click On Below Link for Download Free of Nisego Mirko And The Quirk of Love! (My Hero Academia) in PDF / Zip File Format.<br><br><br><br><br><br>Free Download<br><br><br><br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 31 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://comicsvalley.com/.../01.jpg` (image/jpeg, 292654 bytes, 905x1280) |  |  |  |
