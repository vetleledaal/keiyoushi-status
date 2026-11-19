# Extension Validation Report

- Extension: tachiyomi-ar.hizomanga-v1.6.60
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 4177563748162518441
- Source name: Hizo Manga
- Source language: ar
- Selected manga input: popular offset 0: Your Eternal Lies (`.../12346`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Your Eternal Lies (`.../12346`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | The Stereotypical Life of a Reincarnated Lady (`.../2081`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | even if i fall into a horror story, i still have to go to work (`.../160224`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Star in the daytime (`.../7917`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Your Eternal Lies (`.../12346`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Your Eternal Lies (`.../12346`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 81 | 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 22 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Your Eternal Lies, URL=`12346` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hizomanga.net/.../%D8%A3%D9%83%D8%A7%D8%B0%D9%8A%D8%A8%D9%83-%D8%A7%D9%84%D8%A3%D8%A8%D8%AF%D9%8A%D8%A9-1.jpg` (image/jpeg, 229327 bytes, 960x1392) |  |  |  |
| details identity | PASS | Details preserved selected URL `12346` |  |  |  |
| details thumbnail URL | PASS | `https://hizomanga.net/.../%D8%A3%D9%83%D8%A7%D8%B0%D9%8A%D8%A8%D9%83-%D8%A7%D9%84%D8%A3%D8%A8%D8%AF%D9%8A%D8%A9-1.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | إثارة, تاريخي, جوسي, رومانسي |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | سُجنت روزين والكر لقتلها زوجها في سن السابعة عشرة. بعد أن سحقت كبرياء الجيش الإمبراطوري بعمليتي هروب من السجن، قُبض عليها مرة أخرى بعد عام وحُكم عليها بالسجن مدى الحياة. على متن قارب متجه إلى جزيرة مونتي، حيث تجمع أسوأ السجناء فقط، خططت لعملية هروب آخرى… “ما جريمتكِ؟” “…أنا بريئة” “قلة من السجناء فقط هم الذين يعترفون بصدق بأنهم ارتكبوا جريمة”. إيان كونور، الضابط الجلف والمستقيم،المسؤول عن ترحيلها، لا يسمح لها بأي مناورة “لا تتفوهي بالترهات، أجيبي عن السؤال وحسب.” روزين، أفضل هاربة من السجن في الإمبراطورية، وإيان كونور، بطل حرب شاب محبوب من قبل الإمبراطورية بأكملها. قصتهم تتكشف على السفينة المتجهة إلى أسوأ سجن على وجه الأرض! الآن أنت الحكم. هل روزين والكر كاذبة؟ أم لا؟ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 81 chapters |  |  |  |
| chapter dates | PASS | 81 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 22 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://hizomanga.net/.../01-508.jpg` (image/jpeg, 1218486 bytes, 1200x9097) |  |  |  |
