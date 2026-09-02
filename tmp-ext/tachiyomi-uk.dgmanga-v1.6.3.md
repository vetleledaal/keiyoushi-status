# Extension Validation Report

- Extension: tachiyomi-uk.dgmanga-v1.6.3
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8158890639660553015
- Source name: DGManga
- Source language: uk
- Selected manga input: popular offset 0: Зайвий у романі (`.../69b4844241350ac0f6baf7e7`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 27 | Зайвий у романі (`.../69b4844241350ac0f6baf7e7`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 28 | Зимокрай (`.../69582da2c9a871b369733928`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Трансформери Диноботи: Максимум (`.../6a7b0770674e668c1a971138`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 22 | Чері Краш (`.../695b8bbc71e0fb5da1d5f1e1`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Зайвий у романі (`.../69b4844241350ac0f6baf7e7`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Зайвий у романі (`.../69b4844241350ac0f6baf7e7`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 170 | Том 1 Розділ 1  (`.../69b4844241350ac0f6baf7e7`) |  | <1s |
| pages | `getPageList(chapter)` | success | 7 |  |  | <1s |

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
| popular listing | PASS | 27 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Зайвий у романі, URL=`69b4844241350ac0f6baf7e7` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 103/103 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 103/103 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.dgmanga.app/.../1773438018503-550d1a11ca07ceee-cover.webp` (image/webp (container: extended), 138012 bytes, 721x1030) |  |  |  |
| details identity | PASS | Details preserved selected URL `69b4844241350ac0f6baf7e7` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.dgmanga.app/.../1773438018503-550d1a11ca07ceee-cover.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 12+, Манхва, Демони, Надприродне, Бойовик, Школа, Бойові мистецтва, Шьонен, Суперсила, Пригоди, Драма, Фантастика |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | У кожному романі часто є свій власний світ і безліч персонажів, що живуть у ньому. Однак, крім головних героїв та їх помічників, більшість із них навіть імені не має. "Чхундон, ти якого рівня?"<br><br>Альтернативні назви: 소설 속 엑스트라,The Novel's Extra,Soseol Sog Egseuteula |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 1 name, chapter 2 name, chapter 3 name, chapter 4 name, chapter 5 name, chapter 6 name, chapter 7 name, chapter 8 name, chapter 9 name, chapter 10 name, chapter 11 name, chapter 12 name, chapter 13 name, chapter 14 name, chapter 15 name, chapter 16 name, chapter 17 name, chapter 18 name, chapter 19 name, chapter 20 name, chapter 21 name, chapter 22 name, chapter 23 name, chapter 24 name, chapter 25 name, chapter 26 name, chapter 27 name, chapter 29 name, chapter 30 name, chapter 31 name, chapter 32 name, chapter 33 name, chapter 34 name, chapter 35 name, chapter 36 name, chapter 37 name, chapter 38 name, chapter 39 name, chapter 40 name, chapter 41 name, chapter 42 name, chapter 43 name, chapter 44 name, chapter 45 name, chapter 46 name, chapter 47 name, chapter 48 name, chapter 49 name, chapter 50 name, chapter 51 name, chapter 52 name, chapter 53 name, chapter 54 name, chapter 55 name, chapter 56 name, chapter 57 name, chapter 58 name, chapter 59 name, chapter 60 name, chapter 61 name, chapter 62 name, chapter 63 name, chapter 64 name, chapter 65 name, chapter 66 name, chapter 67 name, chapter 68 name, chapter 69 name, chapter 70 name, chapter 71 name, chapter 73 name, chapter 74 name, chapter 75 name, chapter 76 name, chapter 77 name, chapter 78 name, chapter 79 name, chapter 80 name, chapter 81 name, chapter 82 name, chapter 83 name, chapter 84 name, chapter 85 name, chapter 86 name, chapter 87 name, chapter 88 name, chapter 89 name, chapter 90 name, chapter 91 name, chapter 92 name, chapter 93 name, chapter 94 name, chapter 95 name, chapter 96 name, chapter 97 name, chapter 98 name, chapter 99 name, chapter 100 name, chapter 101 name, chapter 102 name, chapter 103 name, chapter 104 name, chapter 105 name, chapter 106 name, chapter 107 name, chapter 108 name, chapter 109 name, chapter 110 name, chapter 111 name, chapter 112 name, chapter 113 name, chapter 114 name, chapter 115 name, chapter 116 name, chapter 117 name, chapter 118 name, chapter 119 name, chapter 120 name, chapter 122 name, chapter 123 name, chapter 124 name, chapter 125 name, chapter 126 name, chapter 127 name, chapter 128 name, chapter 129 name, chapter 130 name, chapter 131 name, chapter 132 name, chapter 133 name, chapter 134 name, chapter 135 name, chapter 136 name, chapter 137 name, chapter 138 name, chapter 139 name, chapter 140 name, chapter 141 name, chapter 142 name, chapter 143 name, chapter 144 name, chapter 145 name, chapter 146 name, chapter 147 name, chapter 148 name, chapter 149 name, chapter 150 name, chapter 151 name, chapter 152 name, chapter 153 name, chapter 154 name, chapter 155 name, chapter 156 name, chapter 157 name, chapter 158 name, chapter 159 name, chapter 160 name, chapter 161 name, chapter 162 name, chapter 163 name, chapter 164 name, chapter 165 name, chapter 166 name, chapter 167 name, chapter 168 name, chapter 169 name, chapter 170 name |  |  |  |
| chapters | PASS | 170 chapters |  |  |  |
| chapter dates | PASS | 170 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 7 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.dgmanga.app/.../1773438019585-ea2f82b9b6250b19-page-01.jpg` (image/jpeg, 3423425 bytes, 760x20000) |  |  |  |
