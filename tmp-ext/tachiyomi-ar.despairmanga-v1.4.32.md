# Extension Validation Report

- Extension: tachiyomi-ar.despairmanga-v1.4.32
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 886527590434722171
- Source name: Despair Manga
- Source language: ar
- Selected manga input: popular offset 0: solo leveling (`.../solo-leveling`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | solo leveling (`.../solo-leveling`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | bastard (`.../bastard`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Haimiya-senpai wa Kowakute Kawaii (`.../haimiya-senpai-wa-kowakute-kawaii`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | The S-Class Hunter Doesn’t Want to Be a Villainous Princess (`.../the-s-class-hunter-doesnt-want-to-be-a-villainous-princess`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | solo leveling (`.../solo-leveling`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | solo leveling (`.../solo-leveling`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 202 | Chapter 1 (`.../solo-leveling-%D8%A7%D9%84%D9%81%D8%B5%D9%84-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 27 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=solo leveling, URL=`.../solo-leveling` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 82/82 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 82/82 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i2.wp.com/.../3735db06155a37509d5446c19e9ea8e3.jpg <redacted query values: resize>` (image/jpeg, 8714 bytes, 165x225) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../solo-leveling` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i2.wp.com/.../3735db06155a37509d5446c19e9ea8e3.jpg` (image/jpeg, 100707 bytes, 1080x1549) |  |  |  |
| details author | PASS | Chugong |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | أكشن, خيال, سحر, شونين, شياطين, مانهوا, مغامرة, Manhwa |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | قبل 10 سنوات ، بعد ظهور “الباب” الذي يربط العالم الحقيقي بعالم الوحوش ، كل يوم كان لدى بعض الناس العاديين القدرة على اصطياد الوحوش داخل الباب. يُعرفون باسم “الصيادين”. ومع ذلك ، ليس كل الصيادين أقوياء. اسمي سونغ جين وو ، صياد من الرتبة الإلكترونية. أنا شخص محاط بخطر مميت حتى في أضعف زنزانة ، “أضعف صياد في العالم”. لم يكن لدي أي مهارات على الإطلاق لعرضها ، حتى وجدت أصعب زنزانة من الرتبة D مخبأة في الداخل! في النهاية عندما قبلت الموت ، تلقيت فجأة قوة غريبة ، سجل بحث لا يسعني إلا أن أراه ، وهو سر لتسوية ، هذا ما أعرفه عنه! إذا تدربت وفقًا لهذه المهام واصطدت الوحوش ، فسوف ينتقل مستواي من أضعف صياد إلى أقوى صياد من رتبة S! . |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 202 chapters |  |  |  |
| chapter dates | PASS | 202 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 27 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://i1.wp.com/.../01.webp <redacted query values: ssl>` (image/webp (encoding: lossy), 98796 bytes, 858x1306) |  |  |  |
