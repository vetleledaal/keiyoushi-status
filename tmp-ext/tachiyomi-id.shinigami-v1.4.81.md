# Extension Validation Report

- Extension: tachiyomi-id.shinigami-v1.4.81
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

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3411809758861089969
- Source name: Shinigami
- Source language: id
- Selected manga input: latest offset 0: Player Who Cant Level UP (`.../7701ba39-f6b3-46ab-873f-cbc1fe93fb10`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | Demonic Emperor (`.../c0f1d049-ff7f-474d-8c6a-3a55e4c44147`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 30 | The Regressed Son Of A Duke Is An Assassin (`.../b5f07831-f952-4919-af7c-aae4cadeb607`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 30 | Player Who Cant Level UP (`.../7701ba39-f6b3-46ab-873f-cbc1fe93fb10`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | The Investor Who Sees The Future (`.../e99b59e1-1ba4-4172-af2e-9186afb474f3`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 30 | Player Who Cant Level UP (`.../7701ba39-f6b3-46ab-873f-cbc1fe93fb10`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Player Who Cant Level UP (`.../7701ba39-f6b3-46ab-873f-cbc1fe93fb10`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 242 | Chapter 1  (`.../cf505ec1-8718-4c4e-b889-d960678e012f`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 29 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Player Who Cant Level UP, URL=`7701ba39-f6b3-46ab-873f-cbc1fe93fb10` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=The Investor Who Sees The Future, URL=`e99b59e1-1ba4-4172-af2e-9186afb474f3` at page 1 offset 29 and page 2 offset 0 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 150/150 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 150/150 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://assets.shngm.id/.../2e4ab6a6-a1ff-4919-a28e-58348f70cca3.jpg` (image/jpeg, 48239 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `7701ba39-f6b3-46ab-873f-cbc1fe93fb10` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | GaVinGe, Parrot Kim |  |  |  |
| details artist | PASS | Studio Khit, Tae_A |  |  |  |
| details genres | PASS | Action, Adventure, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Malangnya nasibku levelku turu<br>Kim Gigyu Awakening sebagai player pada usia 18 tahun Dia mengira hidupnya berada di jalur menuju kesuksesan Climbing The Tower dan menutup gates namun setelah menyelesaikan tutorial dia masih level 1 Dia membunuh goblin seharian dan dia tetap masih level 1 Bahkan setelah 5 tahun dia masih level 1 Siapa yang mengira kalau ada player seperti ini Tidak ada yang tahu. |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 1 name, chapter 2 name, chapter 3 name, chapter 4 name, chapter 5 name, chapter 6 name, chapter 7 name, chapter 8 name, chapter 9 name, chapter 10 name, chapter 11 name, chapter 12 name, chapter 13 name, chapter 14 name, chapter 15 name, chapter 16 name, chapter 17 name, chapter 18 name, chapter 19 name, chapter 20 name, chapter 21 name, chapter 22 name, chapter 23 name, chapter 24 name, chapter 25 name, chapter 26 name, chapter 27 name, chapter 28 name, chapter 29 name, chapter 30 name, chapter 31 name, chapter 32 name, chapter 33 name, chapter 34 name, chapter 35 name, chapter 36 name, chapter 37 name, chapter 38 name, chapter 39 name, chapter 40 name, chapter 41 name, chapter 42 name, chapter 43 name, chapter 44 name, chapter 45 name, chapter 46 name, chapter 47 name, chapter 48 name, chapter 49 name, chapter 50 name, chapter 51 name, chapter 52 name, chapter 53 name, chapter 54 name, chapter 55 name, chapter 56 name, chapter 57 name, chapter 58 name, chapter 59 name, chapter 60 name, chapter 61 name, chapter 62 name, chapter 63 name, chapter 64 name, chapter 65 name, chapter 66 name, chapter 67 name, chapter 68 name, chapter 69 name, chapter 70 name, chapter 71 name, chapter 72 name, chapter 74 name, chapter 75 name, chapter 76 name, chapter 77 name, chapter 78 name, chapter 79 name, chapter 80 name, chapter 81 name, chapter 82 name, chapter 83 name, chapter 84 name, chapter 85 name, chapter 86 name, chapter 87 name, chapter 88 name, chapter 89 name, chapter 90 name, chapter 91 name, chapter 92 name, chapter 93 name, chapter 94 name, chapter 95 name, chapter 96 name, chapter 97 name, chapter 98 name, chapter 99 name, chapter 100 name, chapter 101 name, chapter 102 name, chapter 103 name, chapter 104 name, chapter 105 name, chapter 106 name, chapter 107 name, chapter 108 name, chapter 109 name, chapter 110 name, chapter 111 name, chapter 112 name, chapter 113 name, chapter 114 name, chapter 115 name, chapter 116 name, chapter 117 name, chapter 118 name, chapter 119 name, chapter 120 name, chapter 121 name, chapter 122 name, chapter 123 name, chapter 124 name, chapter 125 name, chapter 126 name, chapter 127 name, chapter 128 name, chapter 129 name, chapter 130 name, chapter 131 name, chapter 132 name, chapter 133 name, chapter 134 name, chapter 135 name, chapter 136 name, chapter 137 name, chapter 138 name, chapter 139 name, chapter 140 name, chapter 141 name, chapter 142 name, chapter 143 name, chapter 144 name, chapter 145 name, chapter 146 name, chapter 147 name, chapter 148 name, chapter 149 name, chapter 150 name, chapter 151 name, chapter 152 name, chapter 153 name, chapter 154 name, chapter 155 name, chapter 156 name, chapter 157 name, chapter 158 name, chapter 159 name, chapter 160 name, chapter 161 name, chapter 162 name, chapter 163 name, chapter 164 name, chapter 165 name, chapter 166 name, chapter 167 name, chapter 168 name, chapter 169 name, chapter 170 name, chapter 171 name, chapter 172 name, chapter 173 name, chapter 174 name, chapter 175 name, chapter 176 name, chapter 177 name, chapter 178 name, chapter 179 name, chapter 180 name, chapter 181 name, chapter 182 name, chapter 183 name, chapter 184 name, chapter 185 name, chapter 186 name, chapter 187 name, chapter 188 name, chapter 189 name, chapter 190 name, chapter 191 name, chapter 192 name, chapter 193 name, chapter 194 name, chapter 195 name, chapter 196 name, chapter 197 name, chapter 198 name, chapter 199 name, chapter 200 name, chapter 201 name, chapter 202 name, chapter 203 name, chapter 204 name, chapter 205 name, chapter 206 name, chapter 207 name, chapter 208 name, chapter 209 name, chapter 210 name, chapter 211 name, chapter 212 name, chapter 213 name, chapter 214 name, chapter 215 name, chapter 216 name, chapter 217 name, chapter 218 name, chapter 219 name, chapter 220 name, chapter 221 name, chapter 222 name, chapter 223 name, chapter 224 name, chapter 225 name, chapter 226 name, chapter 227 name, chapter 228 name, chapter 229 name, chapter 230 name, chapter 231 name, chapter 232 name, chapter 233 name, chapter 234 name, chapter 235 name, chapter 236 name, chapter 237 name, chapter 238 name, chapter 239 name, chapter 240 name, chapter 241 name, chapter 242 name |  |  |  |
| chapters | PASS | 242 chapters |  |  |  |
| chapter dates | PASS | 242 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 29 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://assets.shngm.id/.../1-b6c39d12ccca.jpg` (image/jpeg, 132160 bytes, 1124x768) |  |  |  |
