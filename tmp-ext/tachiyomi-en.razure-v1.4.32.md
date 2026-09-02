# Extension Validation Report

- Extension: tachiyomi-en.razure-v1.4.32
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 31
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3017959474962204247
- Source name: Razure
- Source language: en
- Selected manga input: latest offset 0: Mame and the Little One ~ The Witch Apprentice Girl Walks Along with a Potted Plant in Hand ~ (`.../mame-and-the-little-one-the-witch-apprentice-girl-walks-along-with-a-potted-plant-in-hand`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 0 |  |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 2 | Mame and the Little One ~ The Witch Apprentice Girl Walks Along with a Potted Plant in Hand ~ (`.../mame-and-the-little-one-the-witch-apprentice-girl-walks-along-with-a-potted-plant-in-hand`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 2 | Mame and the Little One ~ The Witch Apprentice Girl Walks Along with a Potted Plant in Hand ~ (`.../mame-and-the-little-one-the-witch-apprentice-girl-walks-along-with-a-potted-plant-in-hand`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Mame and the Little One ~ The Witch Apprentice Girl Walks Along with a Potted Plant in Hand ~ (`.../mame-and-the-little-one-the-witch-apprentice-girl-walks-along-with-a-potted-plant-in-hand`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Mame and the Little One ~ The Witch Apprentice Girl Walks Along with a Potted Plant in Hand ~ (`.../mame-and-the-little-one-the-witch-apprentice-girl-walks-along-with-a-potted-plant-in-hand`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 12 | Chapter 1 (`.../mame-and-the-little-one-the-witch-apprentice-girl-walks-along-with-a-potted-plant-in-hand-chapter-1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 47 |  |  | 1-10s |

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
| popular listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest listing | PASS | 2 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Mame and the Little One ~ The Witch Apprentice Girl Walks Along with a Potted Plant in Hand ~, URL=`.../mame-and-the-little-one-the-witch-apprentice-girl-walks-along-with-a-potted-plant-in-hand` |  |  |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | SKIP | Page 1 has no manga to check |  |  |  |
| latest pagination | FAIL | Page 2 is empty despite page 1 advertising a next page | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 5/5 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 5/5 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i0.wp.com/.../be798686-9b9c-4867-920c-54f9b46549b5.jpg <redacted query values: resize>` (image/jpeg, 49854 bytes, 285x425) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../mame-and-the-little-one-the-witch-apprentice-girl-walks-along-with-a-potted-plant-in-hand` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i0.wp.com/.../be798686-9b9c-4867-920c-54f9b46549b5.jpg` (image/jpeg, 224995 bytes, 750x1060) |  |  |  |
| details author | PASS | Tadano Gyo |  |  |  |
| details artist | PASS | Solty |  |  |  |
| details genres | PASS | Comedy, Fantasy, Slice of life, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | A girl named Mame, who lives deep in the forest with her witch mentor, has today proudly become an apprentice witch. With her amazing “five-star” talent for plant magic, she is full of excitement about using magic for the first time. Right away, when she infuses a mandrake seedling with magical power… pop! It grows instantly and starts moving like a little person!? “Piki!” “What’s this? Let’s see, you’re a new species of mandrake, aren’t you?” With the help of these creatures she names Golapi, being healed by them, and sometimes having her daily life disrupted by them, she continues her witch training. Then, a request arrives from the royal capital to treat the princess…? A sprouting fantasy about a girl devoted to witch training together with mysterious creatures!<br><br>Alternative Names: Mame To Chikkoino ～ Majo Minarai No Shojo Wa Hachiue Ote Ni Tokotoko Aruku ～@ COMIC, マメーとちっこいの～魔女見習いの少女は鉢植えを手にとことこ歩く～@COMIC |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 12 chapters |  |  |  |
| chapter dates | PASS | 12 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 47 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://i2.wp.com/.../01.jpg` (image/webp (encoding: lossy), 288124 bytes, 1125x1600) |  |  |  |
